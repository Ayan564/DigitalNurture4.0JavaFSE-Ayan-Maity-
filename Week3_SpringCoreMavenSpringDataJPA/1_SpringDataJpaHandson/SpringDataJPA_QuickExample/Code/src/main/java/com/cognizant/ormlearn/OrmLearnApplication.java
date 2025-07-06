package com.cognizant.ormlearn;

import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.model.Country;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CountryService countryService) {
        return (args) -> {
            countryService.addCountry(new Country("IN", "India"));
            countryService.addCountry(new Country("US", "United States"));

            List<Country> countries = countryService.getAllCountries();
            countries.forEach(System.out::println);
        };
    }
}
