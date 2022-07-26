package com.ardhi.neo4jAccess.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.ardhi.neo4jAccess.Entities.Products;

//@Repository
//public interface productRepo extends Neo4jRepository<Products,String >{
//}

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface productRepo extends  PagingAndSortingRepository<Products, Long> {
	//Mono<Category> findByName(String name);

}