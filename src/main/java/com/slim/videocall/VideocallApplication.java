package com.slim.videocall;

import com.slim.videocall.user.User;
import com.slim.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideocallApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(
            UserService service
    ) {
        return args -> {
            service.register(User.builder()
                    .username("slim")
                    .email("slim@gmail.com")
                    .password("slim")
                    .build());

            service.register(User.builder()
                    .username("test1")
                    .email("test1@gmail.com")
                    .password("test1")
                    .build());

            service.register(User.builder()
                    .username("test2")
                    .email("test1@gmail.com")
                    .password("test2")
                    .build());
        };
    }

}