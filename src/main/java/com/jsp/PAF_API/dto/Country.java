package com.jsp.PAF_API.dto;

public class Country 
{
	private String name;
    private int population;
    private int area;
    private String language;
	public Country(String name, int population, int area, String language) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
    
    
}
