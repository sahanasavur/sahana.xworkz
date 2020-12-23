package com.xworkz.sports;

import com.xworkz.sports.constants.FootWearType;
import com.xworkz.sports.footware.ShoeFootWear;

public class FWTester {

	public static void main(String[] args) {
		ShoeFootWear shoeFootWear = new ShoeFootWear();

		shoeFootWear.setBrand("Adidas");
		shoeFootWear.setSize(7);
		shoeFootWear.setPrice(2000);
		shoeFootWear.setFootWearType(FootWearType.SPORTS);

		shoeFootWear.displayDetails();

		double dis = shoeFootWear.calculateDiscount();
		System.out.println(dis);
		System.out.println(" ");

		shoeFootWear.setBrand("Sneakers");
		shoeFootWear.setSize(8);
		shoeFootWear.setPrice(3000);
		shoeFootWear.setFootWearType(FootWearType.PARTY);

		shoeFootWear.displayDetails();

		double dis1 = shoeFootWear.calculateDiscount();
		System.out.println(dis1);

	}

}
