package com.ardhi.neo4jAccess.Entities;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node
public class Products {
	
	@Id @GeneratedValue 
	private Long id;
	private String name;
	
	
	@Relationship(type="component_of", direction = Direction.INCOMING)
	private Set<ProductComponents> productComponents=new HashSet<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long productId) {
		this.id = productId;
	}
	public void setName(String productName)
	{
		this.name=productName;
	}
	public String getName()
	{
		return this.name;
	}

}
