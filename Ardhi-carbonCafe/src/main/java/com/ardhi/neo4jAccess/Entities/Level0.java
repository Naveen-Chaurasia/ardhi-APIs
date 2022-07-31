package com.ardhi.neo4jAccess.Entities;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;
@Node
public class Level0 {

	@Id @GeneratedValue 
	private Long id;
	private Double CarbonEmission;
	private Double Energy;
	private Double ReuseByRecyclePercentage;
	private Double Toxicity;
	private Double Water;
	
	@Relationship(type="HAS_MATERIAL", direction = Direction.OUTGOING)
	private Set<Level1> Level1=new HashSet<>();
	
	public Double  getCarbonEmission() {
		return CarbonEmission;
	}

	public void setCarbonEmission(Double  carbonEmission) {
		CarbonEmission = carbonEmission;
	}

	

	public Double getEnergy() {
		return Energy;
	}

	public void setEnergy(Double energy) {
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

	public Set<Level1> getLevel1() {
		return Level1;
	}

	public void setLevel1(Set<Level1> level1) {
		Level1 = level1;
	}

	public Double getWater() {
		return Water;
	}

	public void setWater(Double water) {
		Water = water;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long categoryId) {
		id = categoryId;
	}



}
