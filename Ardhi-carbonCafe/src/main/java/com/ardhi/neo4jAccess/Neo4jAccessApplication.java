package com.ardhi.neo4jAccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableNeo4jRepositories
@EnableTransactionManagement
@EnableSwagger2
@EnableWebMvc

public class Neo4jAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jAccessApplication.class, args);
	}
	
	
	 @Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.ardhi")).build();
	   }
	 @Bean
	  public InternalResourceViewResolver defaultViewResolver() {
	    return new InternalResourceViewResolver();
	  }
	 @Bean
     public ApiInfo getApiInfo() {

       return new ApiInfoBuilder()
               .title("Ardhi Carbon Cafe API Doc")
               .description("More description about the API")
               .version("1.0.0")
               .build();
   }
	 
	 
}
