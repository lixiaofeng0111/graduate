package edu.graduate.bean.extend;

import java.util.List;

import edu.graduate.bean.PreganInfo;

public class FruitVM {
	private int id;
	private String name;
	private String picture;
	private String desc;
	
	/*
	 fruit()
	 
	 */

	private PreganInfo preganInfo;
	private List<NutritionVM> nutritionVMs;

	public List<NutritionVM> getNutritionVMs() {
		return nutritionVMs;
	}

	public void setNutritionVMs(List<NutritionVM> nutritionVMs) {
		this.nutritionVMs = nutritionVMs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public PreganInfo getPreganInfo() {
		return preganInfo;
	}

	public void setPreganInfo(PreganInfo preganInfo) {
		this.preganInfo = preganInfo;
	}

}
