package com.xworkz.data.dto;

public class CountryDTO {

	public String name;
	public String continent;
	public String[] states;
	public String population;
	public String president;
	public String primeMinister;

	public CountryDTO(String country, String continent, String minister, String presidentName,
			String citizens) {
		this.name = country;
		this.continent = continent;
		//this.states = states;
		this.primeMinister = minister;
		this.president = presidentName;
		this.population = citizens;

		
		
		
		
		
	}
}