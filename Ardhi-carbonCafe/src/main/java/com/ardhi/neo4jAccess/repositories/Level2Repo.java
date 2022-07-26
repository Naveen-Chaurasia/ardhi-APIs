package com.ardhi.neo4jAccess.repositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.ardhi.neo4jAccess.Entities.Level2;

@RepositoryRestResource(collectionResourceRel = "Level2", path = "Level2")
public interface Level2Repo extends  PagingAndSortingRepository<Level2, Long> {
	//Mono<Category> findByName(String name);

}
