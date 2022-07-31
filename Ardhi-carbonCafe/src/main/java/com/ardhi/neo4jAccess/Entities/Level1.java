package com.ardhi.neo4jAccess.Entities;



import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;


@Node
public class Level1 {

	@Id @GeneratedValue 
	private Long id;
	private Double CarbonEmission;
	private String Energy;
	private Double ReuseByRecyclePercentage;
	private Double Toxicity;
	private Double Water;
	private String Material;
	
	
	
	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	@Relationship(type="HAS_SUBMATERIAL", direction = Direction.OUTGOING)
	private Set<Level2> Level2=new HashSet<>();



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getCarbonEmission() {
		return CarbonEmission;
	}

	public void setCarbonEmission(Double carbonEmission) {
		CarbonEmission = carbonEmission;
	}

	public String getEnergy() {
		return Energy;
	}

	public void setEnergy(String energy) {
		Energy = energy;
	}

	public Double getReuseByRecyclePercentage() {
		return ReuseByRecyclePercentage;
	}

	public void setReuseByRecyclePercentage(Double reuseByRecyclePercentage) {
		ReuseByRecyclePercentage = reuseByRecyclePercentage;
	}

	public Double getToxicity() {
		return Toxicity;
	}

	public void setToxicity(Double toxicity) {
		Toxicity = toxicity;
	}

	public Double getWater() {
		return Water;
	}

	public void setWater(Double water) {
		Water = water;
	}

	public Set<Level2> getLevel2() {
		return Level2;
	}

	public void setLevel2(Set<Level2> level2) {
		Level2 = level2;
	}	
	
		
	


}
