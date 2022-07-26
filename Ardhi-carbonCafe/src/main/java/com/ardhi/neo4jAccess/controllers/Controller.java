package com.ardhi.neo4jAccess.controllers;

import java.util.List;
import java.util.Optional;

import org.neo4j.driver.internal.shaded.reactor.core.publisher.Flux;
import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ardhi.neo4jAccess.Entities.Category;
import com.ardhi.neo4jAccess.repositories.CategoryRepo;
import com.ardhi.neo4jAccess.services.service;

@RestController
public class Controller {
		
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}

}
