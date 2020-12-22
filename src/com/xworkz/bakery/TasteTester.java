package com.xworkz.bakery;

import com.xworkz.bakery.cake.Cake;
import com.xworkz.bakery.cake.HoneyCake;

public class TasteTester {

	public static void main(String[] args) {

		Cake cake = new Cake();
		System.out.println("Createtd Object");
		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());
		System.out.println("   ");

		HoneyCake honeycake = new HoneyCake();
		System.out.println("Createtd another Object");
		System.out.println(honeycake.getFlavour());
		System.out.println(honeycake.getShape());
		System.out.println(honeycake.getSize());
		System.out.println("   ");

		boolean sweet = cake.equals(honeycake);
		System.out.println(sweet);

		int num = cake.hashCode();
		System.out.println(num);

		String convert = cake.toString();
		System.out.println(convert);

		Class<? extends Cake> pin = honeycake.getClass();
		System.out.println(pin);
		

		
	}

}
