package com.ardhi.neo4jAccess.Entities;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

public class Level2 {

	@Id @GeneratedValue 
	private Long id;
	private String CarbonEmissionPerMaterial;
	private String SubMaterial;
	public Long getId() {
		return id;
	}
	
	@Relationship(type="PRESENT_IN", direction = Direction.INCOMING)
	private Set<Level2> Level2=new HashSet<>();	
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getCarbonEmissionPerMaterial() {
		return CarbonEmissionPerMaterial;
	}
	public void setCarbonEmissionPerMaterial(String carbonEmissionPerMaterial) {
		CarbonEmissionPerMaterial = carbonEmissionPerMaterial;
	}
	public String getSubMaterial() {
		return SubMaterial;
	}
	public void setSubMaterial(String subMaterial) {
		SubMaterial = subMaterial;
	}
	
	
	
}
