package com.ardhi.neo4jAccess.repositories;


import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ardhi.neo4jAccess.Entities.Category;
import com.ardhi.neo4jAccess.Entities.Level1;

@RepositoryRestResource(collectionResourceRel = "Level1", path = "Level1")
public interface Level1Repo extends  PagingAndSortingRepository<Level1, Long> {
	//Mono<Category> findByName(String name);

}
