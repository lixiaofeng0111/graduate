package edu.graduate.bean.extend;

import java.util.List;

import edu.graduate.bean.Nutrition;
import edu.graduate.bean.PregnantInfo;

public class FruitVM {
	private Long id;
	private String name;
	private String picture;
	private String description;
	
	private PregnantInfo pregnantInfo;
	private List<Nutrition> nutritions;

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

	public String getPicture() {
		return picture;
	}

	
	public PregnantInfo getPregnantInfo() {
		return pregnantInfo;
	}

	public void setPregnantInfo(PregnantInfo pregnantInfo) {
		this.pregnantInfo = pregnantInfo;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Nutrition> getNutritions() {
		return nutritions;
	}

	public void setNutritions(List<Nutrition> nutritions) {
		this.nutritions = nutritions;
	}
	

}
