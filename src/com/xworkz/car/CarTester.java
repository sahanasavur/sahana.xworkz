package com.xworkz.car;

import com.xworkz.car.carshowroom.Showroom;
import com.xworkz.car.constant.CarVariant;
import com.xworkz.car.manager.CarDTO;

public class CarTester {

	public static void main(String[] args) {

		Showroom carShowroom = new Showroom();

		CarDTO dto = new CarDTO("Duster", 1200000, CarVariant.TOP);
		carShowroom.addCar(dto);
		
		CarDTO dto2 = new CarDTO("Alto 800", 5000000, CarVariant.BASE);
		carShowroom.addCar(dto2);
		
		CarDTO dto3 = new CarDTO("Swift", 1000000, CarVariant.TOP);
		carShowroom.addCar(dto3);
		
		CarDTO dto4 = new CarDTO("Benz", 4200000, CarVariant.TOP);
		carShowroom.addCar(dto4);
		
		CarDTO dto5 = new CarDTO("BMW", 3700000, CarVariant.TOP);
		carShowroom.addCar(dto5);
		
		CarDTO dto6 = new CarDTO("FORTUNER", 4000000, CarVariant.TOP);
		carShowroom.addCar(dto6);
		carShowroom.displayCars();
		System.out.println(" ");
		
		carShowroom.updateCarVariant(CarVariant.BASE,3);
		System.out.println(" ");
		carShowroom.displayCarAtIndex(3);
		System.out.println(" ");
		carShowroom.displayCarByModel("BMW");
		carShowroom.displayCarByModel("Swift");
}
}