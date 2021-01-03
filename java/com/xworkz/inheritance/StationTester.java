package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.PoliceStationDTO;

public class StationTester {
	public static void main(String[] args) {

		Object dto = new PoliceStationDTO("Rajajnnagar", 10, "Rajajinagar Police Station");

		System.out.println(dto);// implicit
		System.out.println(dto.toString());// explicit

		System.out.println(dto.hashCode());
		// print ref --toString
		PoliceStationDTO dto1 = new PoliceStationDTO("Upparpet", 6, "Upparpet Police Station");
		System.out.println(dto1.hashCode());// Collections
		System.out.println(dto1);

		PoliceStationDTO dto2 = new PoliceStationDTO("Upparpet ", 6, "Upparpet  Police Station");

		PoliceStationDTO dto3 = new PoliceStationDTO("MG Road", 3, "Upparpet Polic Station");

		dto1 = dto2;
		boolean equal = dto1.equals(dto3);
		System.out.println(equal);

		if (equal) {
			System.out.println("dto is equal");
		} else {
			System.out.println("dto is not equal");
		}
	}
}
