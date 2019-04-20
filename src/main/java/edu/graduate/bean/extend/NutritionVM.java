package edu.graduate.bean.extend;

import java.util.List;

import edu.graduate.bean.Fruit;

public class NutritionVM {
	private Long id;
	private String name;
	private String description;
	
	private  List<Fruit> fruits ;

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

	public List<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}
	
	

}
