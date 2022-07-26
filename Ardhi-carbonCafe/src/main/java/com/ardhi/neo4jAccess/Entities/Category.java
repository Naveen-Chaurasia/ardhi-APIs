package com.ardhi.neo4jAccess.Entities;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node
public class Category {

	@Id @GeneratedValue 
	private Long id;
	private String name;
	
	
	@Relationship(type="Product_of", direction = Direction.INCOMING)
	private Set<Products> products=new HashSet<>();
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long categoryId) {
		id = categoryId;
	}

	public void setName(String categoryName) {
		this.name = categoryName;
	}

	public String getName() {
		return this.name;
	}

}
