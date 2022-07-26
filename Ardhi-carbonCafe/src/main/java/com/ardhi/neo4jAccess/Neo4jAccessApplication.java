package com.ardhi.neo4jAccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableNeo4jRepositories
@EnableTransactionManagement

public class Neo4jAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jAccessApplication.class, args);
	}

}
