package edu.graduate.bean.extend;

import java.util.List;


import edu.graduate.bean.Nutrition;
import edu.graduate.bean.Reason;

public class FruitVM {
	private Long id;
	private String name;
	private String brief;

	private String picture;
	private String description;
	private String pregnantEat;
	private String momEat;
	private String babyEat;
	
	private List<Nutrition> nutritions;
	private Reason reason;

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
	public String getBrief() {
		return brief;
	}
	
	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getPregnantEat() {
		return pregnantEat;
	}

	public void setPregnantEat(String pregnantEat) {
		this.pregnantEat = pregnantEat;
	}

	public String getMomEat() {
		return momEat;
	}

	public void setMomEat(String momEat) {
		this.momEat = momEat;
	}

	public String getBabyEat() {
		return babyEat;
	}

	public void setBabyEat(String babyEat) {
		this.babyEat = babyEat;
	}
	

	public Reason getReason() {
		return reason;
	}

	public void setReason(Reason reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "FruitVM [id=" + id + ", name=" + name + ", brief=" + brief + ", picture=" + picture + ", description="
				+ description + ", pregnantEat=" + pregnantEat + ", momEat=" + momEat + ", babyEat=" + babyEat
				+ ", nutritions=" + nutritions + ", reason=" + reason + "]";
	}
}
