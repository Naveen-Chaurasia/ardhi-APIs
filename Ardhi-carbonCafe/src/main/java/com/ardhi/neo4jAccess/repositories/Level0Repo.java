package com.ardhi.neo4jAccess.repositories;


import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ardhi.neo4jAccess.Entities.Level0;

@RepositoryRestResource(collectionResourceRel = "Level0", path = "Level0")
public interface Level0Repo extends  PagingAndSortingRepository<Level0, Long> {
	//Mono<Category> findByName(String name);

}


