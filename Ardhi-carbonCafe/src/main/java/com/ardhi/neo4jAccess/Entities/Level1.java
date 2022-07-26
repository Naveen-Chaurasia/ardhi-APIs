package com.ardhi.neo4jAccess.Entities;



import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;


@Node
public class Level1 {

	@Id @GeneratedValue 
	private Long id;
	private String CarbonEmission;
	private String Energy;
	private String ReuseByRecyclePercentage;
	private String Toxicity;
	private String Water;
	
		
	public String  getCarbonEmission() {
		return CarbonEmission;
	}

	public void setCarbonEmission(String  carbonEmission) {
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

	public String getWater() {
		return Water;
	}

	public void setWater(String water) {
		Water = water;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long categoryId) {
		id = categoryId;
	}



}
