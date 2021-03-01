package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@ComponentScan("controller")
@EnableCassandraRepositories("repository")
public class CassandradbTest2Application {

	
	
	public static void main(String[] args) {
		SpringApplication.run(CassandradbTest2Application.class, args);
	}

}
