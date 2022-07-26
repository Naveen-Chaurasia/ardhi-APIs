package com.ardhi.neo4jAccess.Entities;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;


@Node
public class Level0 {

	@Id @GeneratedValue 
	private Long id;
	private Double CarbonEmission;
	private String Energy;
	private String ReuseByRecyclePercentage;
	private String Toxicity;
	private Double Water;
	
		
	public Double  getCarbonEmission() {
		return CarbonEmission;
	}

	public void setCarbonEmission(Double  carbonEmission) {
		CarbonEmission = carbonEmission;
	}

	public String getEnergy() {
		return Energy;
	}

	public void setEnergy(String energy) {
		Energy = energy;
	}

	public String getReuseByRecyclePercentage() {
		return ReuseByRecyclePercentage;
	}

	public void setReuseByRecyclePercentage(String reuseByRecyclePercentage) {
		ReuseByRecyclePercentage = reuseByRecyclePercentage;
	}

	public String getToxicity() {
		return Toxicity;
	}

	public void setToxicity(String toxicity) {
		Toxicity = toxicity;
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
