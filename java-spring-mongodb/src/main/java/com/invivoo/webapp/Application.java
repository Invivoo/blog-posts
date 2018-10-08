package com.invivoo.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.invivoo.webapp.controller._Controller;
import com.invivoo.webapp.repository._MongoRepository;
import com.invivoo.webapp.service._Service;

@ComponentScan(basePackageClasses = { _Controller.class, _Service.class })
@EnableMongoRepositories(basePackageClasses = _MongoRepository.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
}
