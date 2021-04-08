package com.example.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@ComponentScan(basePackages = {
		  "com.example.demo"
})
@EntityScan(basePackageClasses = {
		Employee.class
})
@EnableJpaRepositories(basePackageClasses = {
		EmployeeRepo.class
})
@SpringBootApplication
public class PersistEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersistEmployeeServiceApplication.class, args);
	}

}
