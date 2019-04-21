package edu.graduate.bean.extend;

import java.util.List;

import edu.graduate.bean.Fruit;


public class PregnantInfoVM{
	private Long id;
	private int pregnantweek;
	
	private List<Fruit> fruit;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public List<Fruit> getFruit() {
		return fruit;
	}
	public void setFruit(List<Fruit> fruit) {
		this.fruit = fruit;
	}
	public int getPregnantweek() {
		return pregnantweek;
	}
	public void setPregnantweek(int pregnantweek) {
		this.pregnantweek = pregnantweek;
	}
	
	
}
