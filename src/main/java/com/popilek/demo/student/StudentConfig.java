package com.popilek.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jim = new Student("Jim Jones","jj@gmail.com", LocalDate.of(1983, Month.MARCH, 11));
            Student jane = new Student("Jane Jones","jane.jones@gmail.com", LocalDate.of(1984, Month.MARCH, 11));
            repository.saveAll(List.of(jim, jane));
        };

    }
}
