package com.ardhi.neo4jAccess.Entities;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.cypherdsl.core.Relationship.Direction;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class ProductComponents {
	@Id @GeneratedValue 
	private Long id;
	private String name;
	
	
	private String Cu_content;
	private String Steel_content;
	private String Al_content;
	private String Plastic_content;
	private String Li_ion_Battery_Content;
	private String PCB_content;
	private String Flat_Panel_glass;
	private String CRT_glass;
	private String other_glass;
	private String other_metal_content;
	private String other_contents;
	private String total_mass;
	
	
	public String getLi_ion_Battery_Content() {
		return Li_ion_Battery_Content;
	}
	public void setLi_ion_Battery_Content(String li_ion_Battery_Content) {
		Li_ion_Battery_Content = li_ion_Battery_Content;
	}
	public String getPCB_content() {
		return PCB_content;
	}
	public void setPCB_content(String pCB_content) {
		PCB_content = pCB_content;
	}
	public String getFlat_Panel_glass() {
		return Flat_Panel_glass;
	}
	public void setFlat_Panel_glass(String flat_Panel_glass) {
		Flat_Panel_glass = flat_Panel_glass;
	}
	public String getCRT_glass() {
		return CRT_glass;
	}
	public void setCRT_glass(String cRT_glass) {
		CRT_glass = cRT_glass;
	}
	public String getOther_glass() {
		return other_glass;
	}
	public void setOther_glass(String other_glass) {
		this.other_glass = other_glass;
	}
	public String getOther_metal_content() {
		return other_metal_content;
	}
	public void setOther_metal_content(String other_metal_content) {
		this.other_metal_content = other_metal_content;
	}
	public String getOther_contents() {
		return other_contents;
	}
	public void setOther_contents(String other_contents) {
		this.other_contents = other_contents;
	}
	public String getTotal_mass() {
		return total_mass;
	}
	public void setTotal_mass(String total_mass) {
		this.total_mass = total_mass;
	}
	public String getCu_content() {
		return Cu_content;
	}
	public void setCu_content(String cu_content) {
		Cu_content = cu_content;
	}
	public String getSteel_content() {
		return Steel_content;
	}
	public void setSteel_content(String steel_content) {
		Steel_content = steel_content;
	}
	public String getAl_content() {
		return Al_content;
	}
	public void setAl_content(String al_content) {
		Al_content = al_content;
	}
	public String getPlastic_content() {
		return Plastic_content;
	}
	public void setPlastic_content(String plastic_content) {
		Plastic_content = plastic_content;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
