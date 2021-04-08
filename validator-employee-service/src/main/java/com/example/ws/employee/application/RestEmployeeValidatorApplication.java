package com.example.ws.employee.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { 
		"com.example.ws.employee"
})
@EnableAutoConfiguration(exclude = { 
		DataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class
})
@SpringBootApplication
public class RestEmployeeValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestEmployeeValidatorApplication.class, args);
	}
}
