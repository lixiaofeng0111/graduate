package edu.graduate.bean.extend;

import java.util.List;

public class PregnantDescriptionVM {
	private Integer id;
	private String time;
	private String effect;
	private String description;
	
	private List<NutritionVM> nutritionVMs;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<NutritionVM> getNutritionVMs() {
		return nutritionVMs;
	}

	public void setNutritionVMs(List<NutritionVM> nutritionVMs) {
		this.nutritionVMs = nutritionVMs;
	}

	@Override
	public String toString() {
		return "PregnantDescriptionVM [id=" + id + ", time=" + time + ", effect=" + effect + ", description="
				+ description + ", nutritionVMs=" + nutritionVMs + "]";
	}
	


}
