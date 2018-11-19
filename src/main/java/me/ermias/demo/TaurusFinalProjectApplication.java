package me.ermias.demo;

import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;


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

            Orgs orgs = restTemplate.getForObject("https://api.github.com/orgs/github", Orgs.class);
            log.info(orgs.toString());
            log.info(orgs.getLogin().toString());
            log.info(orgs.getMembers_url().toString());


            User user = restTemplate.getForObject(
                    "https://api.github.com/users/Ermiji", User.class);
            log.info(user.toString());

            Repos_url repos_url = restTemplate.getForObject(
                    "https://api.github.com/users/Ermiji", Repos_url.class);
            log.info(repos_url.toString());


            ResponseEntity<List<User>> memberResponse =
                    restTemplate.exchange("https://api.github.com/orgs/github/members",
                            HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>(){

                            });

            List<User> users = memberResponse.getBody();
            log.info(users.toString());
        };
    }

}
