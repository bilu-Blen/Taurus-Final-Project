package me.ermias.demo;

import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class TaurusFinalProjectApplication {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(TaurusFinalProjectApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            User user = restTemplate.getForObject(
                    "https://api.github.com/users/MelakMinlargilih", User.class);
            log.info(user.toString());

            Repos_url repos_url = restTemplate.getForObject(
                    "https://api.github.com/users/MelakMinlargilih", Repos_url.class);
            log.info(repos_url.toString());
        };
    }

}
