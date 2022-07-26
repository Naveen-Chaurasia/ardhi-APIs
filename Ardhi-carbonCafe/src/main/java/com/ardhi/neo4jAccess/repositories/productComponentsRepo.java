package com.ardhi.neo4jAccess.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.ardhi.neo4jAccess.Entities.Category;
import com.ardhi.neo4jAccess.Entities.ProductComponents;

//@Repository
//public interface productComponentsRepo extends Neo4jRepository<ProductComponents, String> {
//
//}

@RepositoryRestResource(collectionResourceRel = "productComponents", path = "productComponents")
public interface  productComponentsRepo extends  PagingAndSortingRepository<ProductComponents, Long> {
	//Mono<Category> findByName(String name);

}