package com.ardhi.neo4jAccess.repositories;


import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ardhi.neo4jAccess.Entities.Category;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepo extends  PagingAndSortingRepository<Category, Long> {
	//Mono<Category> findByName(String name);

}
