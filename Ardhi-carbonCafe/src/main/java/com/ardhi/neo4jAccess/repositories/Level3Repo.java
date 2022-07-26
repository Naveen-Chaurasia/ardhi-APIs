package com.ardhi.neo4jAccess.repositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.ardhi.neo4jAccess.Entities.Level2;
import com.ardhi.neo4jAccess.Entities.Level3;

@RepositoryRestResource(collectionResourceRel = "Level3", path = "Level3")
public interface Level3Repo extends  PagingAndSortingRepository<Level3, Long> {
	//Mono<Category> findByName(String name);

}
