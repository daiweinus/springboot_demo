package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student david = new Student(
                    "David",
                    "david@gmail.com",
                    LocalDate.of(2000, APRIL, 5)
            );

            Student vivian = new Student(
                    "Vivian",
                    "vivian@gmail.com",
                    LocalDate.of(2001, JULY, 6)
            );

            repository.saveAll(List.of(david, vivian));
        };
    }
}
