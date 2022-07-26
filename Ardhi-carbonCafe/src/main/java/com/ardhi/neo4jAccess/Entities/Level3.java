package com.ardhi.neo4jAccess.Entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

public class Level3 {
	
	
	
	@Id @GeneratedValue 
	private Long id;
	private String MolecularFormula;
	private String MolarMass;
	private String ChemicalName;
	private String CarbonMassPercentageInMolecule;
	private String CarbonGmPerMolar;
	private String CarbonAtomsCount;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMolecularFormula() {
		return MolecularFormula;
	}
	public void setMolecularFormula(String molecularFormula) {
		MolecularFormula = molecularFormula;
	}
	public String getMolarMass() {
		return MolarMass;
	}
	public void setMolarMass(String molarMass) {
		MolarMass = molarMass;
	}
	public String getChemicalName() {
		return ChemicalName;
	}
	public void setChemicalName(String chemicalName) {
		ChemicalName = chemicalName;
	}
	public String getCarbonMassPercentageInMolecule() {
		return CarbonMassPercentageInMolecule;
	}
	public void setCarbonMassPercentageInMolecule(String carbonMassPercentageInMolecule) {
		CarbonMassPercentageInMolecule = carbonMassPercentageInMolecule;
	}
	public String getCarbonGmPerMolar() {
		return CarbonGmPerMolar;
	}
	public void setCarbonGmPerMolar(String carbonGmPerMolar) {
		CarbonGmPerMolar = carbonGmPerMolar;
	}
	public String getCarbonAtomsCount() {
		return CarbonAtomsCount;
	}
	public void setCarbonAtomsCount(String carbonAtomsCount) {
		CarbonAtomsCount = carbonAtomsCount;
	}
	
}
