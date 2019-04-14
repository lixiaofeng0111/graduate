package edu.graduate.bean.extend;

import java.util.List;


public class PregnantInfoVM{
	private int id;
	private String name;
	private int pregnantWeek;
	
	private List<FruitVM> fruitVMs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPregnantWeek() {
		return pregnantWeek;
	}
	public void setPregnantWeek(int pregnantWeek) {
		this.pregnantWeek = pregnantWeek;
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
