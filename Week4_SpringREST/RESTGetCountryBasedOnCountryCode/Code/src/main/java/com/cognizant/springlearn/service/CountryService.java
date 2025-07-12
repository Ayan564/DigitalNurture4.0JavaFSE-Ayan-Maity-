package main.java.com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    public Country getCountry(String code) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = context.getBean("countryList", List.class);
        context.close();

        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null); // null if not found (handled in exception project)
    }
}
