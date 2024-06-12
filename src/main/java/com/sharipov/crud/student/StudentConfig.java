package com.sharipov.crud.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student islom = new Student(
                    "Islom",
                    "tawkenskiy000@gmail.com",
                    LocalDate.of(1997, Month.FEBRUARY, 2)
            );

            Student abdush = new Student(
                    "Abdush",
                    "abdush@gmail.com",
                    LocalDate.of(1996, Month.FEBRUARY, 28)

            );
            studentRepository.saveAll(
                    List.of(islom, abdush)
            );
        };
    }
}
