package com.xworkz.place;

import com.xworkz.place.dto.PlaceDTO;

public class PlaceTester {
	public static void main(String[] args) throws CloneNotSupportedException {

		String location = "Gadag";
		String kingName = "Shivaji";
		String queenName = "Padmavati";

		PlaceDTO dto = new PlaceDTO();

		dto.setLocation(location);
		dto.setKingName(kingName);
		dto.setQueenName(queenName);

		System.out.println(dto.getLocation() + " " + dto.getQueenName());
		System.out.println("King name is " + dto.getKingName());
		System.out.println();

		PlaceDTO dto2 = dto.clone();

		System.out.println(dto2.getLocation() + " " + dto2.getQueenName());
		System.out.println("King name is " + dto2.getKingName());
		dto2.equals(dto);
		dto2.hashCode();
		dto2.toString();
	}
}