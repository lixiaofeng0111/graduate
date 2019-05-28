package edu.graduate.bean.extend;

import java.util.List;

public class NutritionVM {
	private Long id;
	private String name;
	private String description;
	
	private  List<FruitVM> fruits ;
	
	private List<PregnantDescriptionVM> pregnantDescriptionVMs;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<FruitVM> getFruits() {
		return fruits;
	}

	public void setFruits(List<FruitVM> fruits) {
		this.fruits = fruits;
	}
	

	public List<PregnantDescriptionVM> getPregnantDescriptionVMs() {
		return pregnantDescriptionVMs;
	}

	public void setPregnantDescriptionVMs(List<PregnantDescriptionVM> pregnantDescriptionVMs) {
		this.pregnantDescriptionVMs = pregnantDescriptionVMs;
	}

	@Override
	public String toString() {
		return "NutritionVM [id=" + id + ", name=" + name + ", description=" + description + ", fruits=" + fruits + "]";
	}

}
