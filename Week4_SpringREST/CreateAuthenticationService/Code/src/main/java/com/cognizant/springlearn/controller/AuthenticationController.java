package main.java.com.cognizant.springlearn.controller;

import io.jsonwebtoken.*;
import org.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START - authenticate()");
        LOGGER.debug("Authorization Header: {}", authHeader);

        String user = getUser(authHeader);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("END - authenticate()");
        return map;
    }

    private String getUser(String authHeader) {
        String encoded = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes); // format is "username:password"
        return decoded.split(":")[0]; // return only username
    }

    private String generateJwt(String user) {
        JwtBuilder builder = Jwts.builder();
        builder.setSubject(user);
        builder.setIssuedAt(new Date());
        builder.setExpiration(new Date(System.currentTimeMillis() + 1200000)); // 20 mins
        builder.signWith(SignatureAlgorithm.HS256, "secretkey");
        return builder.compact();
    }
}
