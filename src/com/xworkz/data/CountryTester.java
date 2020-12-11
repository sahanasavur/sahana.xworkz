package com.xworkz.data;

import com.xworkz.data.dto.CountryDTO;

@SuppressWarnings("unused")
public class CountryTester {

	public static void main(String[] args) {

		CountryDTO country = new CountryDTO("INDIA", "Asia", "Narendra Modi", "Ram Nath Kovind", "1.3 billion");

		// CountryDTO country2 = new CountryDTO("NORWAY", "Oslo", 11, "Erna Solberg",
		// "No President, only One Ruler","53.3 lakhs");

		System.out.println(country.name);
		System.out.println(country.continent);
		System.out.println(country.states);
		System.out.println(country.primeMinister);
		System.out.println(country.president);
		System.out.println(country.population);

		System.out.println(" ");

	}

}
