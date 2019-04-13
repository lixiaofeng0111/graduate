package edu.graduate.bean.extend;

import java.util.List;


public class PreganInfoVM{
	private int id;
	private String name;
	private int pregantWeek;
	
	private List<FruitVM> fruitVMs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPregantWeek() {
		return pregantWeek;
	}
	public void setPregantWeek(int pregantWeek) {
		this.pregantWeek = pregantWeek;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<FruitVM> getFruitVMs() {
		return fruitVMs;
	}
	public void setFruitVMs(List<FruitVM> fruitVMs) {
		this.fruitVMs = fruitVMs;
	}
	
}
