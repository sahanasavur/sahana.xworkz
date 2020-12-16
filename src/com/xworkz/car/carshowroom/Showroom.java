
package com.xworkz.car.carshowroom;

import com.xworkz.car.constant.*;

import com.xworkz.car.manager.CarDTO;

import com.xworkz.car.manager.ManagerDTO;

public class Showroom {
	private String name;
	private String location;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[5];
	private int currentIndex = 0;

	public Showroom() {
		System.out.println("default constructor");
	}

	public Showroom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void addManager(String name, long contactN0) {
		if (name != null && contactN0 > 0) {
			this.managerDTO = new ManagerDTO(name, contactN0);
			System.out.println("manager added");
		} else {
			System.out.println("data is invalid");
		}
	}

	public void addManager(ManagerDTO name) {
		if (name != null) {
			this.managerDTO = name;
			System.out.println("manager added");
		} else {
			System.out.println("data is invalid");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println((this.managerDTO.getContactNo()));
		} else {
			System.out.println("manager is not there");
		}
	}

	public void removeManager() {
		this.managerDTO = null;
	}

	public void updateManager(long contactNo) {
		if (contactNo > 0 && this.managerDTO != null) {
			this.managerDTO.setContactNo(contactNo);
			System.out.println("details are valid, updated contact number");
		} else {
			System.out.println("cannot update contact number,data is invalid");
		}
	}

	public void addCar(CarDTO car) {
		if (car != null && this.currentIndex < 5) {
			System.out.println("add car");
			System.out.println("index value: " + this.currentIndex);
			this.cars[this.currentIndex] = car;
			this.currentIndex++;
		} else {
			if (car == null) {
				System.out.println("cannot add null");
			}
			if (car != null) {
				System.out.println("cannot add more than " + this.currentIndex + " cars");
			}
		}

	}

	public void displayCars() {

		for (int c = 0; c < this.cars.length; c++) {
			CarDTO cdto = this.cars[c];
			System.out.println(cdto);
			System.out.println(cdto.getModel());
			System.out.println(cdto.getPrice());
			System.out.println(cdto.getVariant());
		}
	}

	public void updateCarVariant(CarVariant newVariant, int indexToUpdate) {
		if (newVariant != null && indexToUpdate >= 0 && indexToUpdate < 5) {
			System.out.println("car index: " + indexToUpdate);
			System.out.println("updated car variant: " + newVariant);
			CarDTO carDTO = this.cars[indexToUpdate];
			System.out.println("updating car " + carDTO.getModel());
			carDTO.setVariant(newVariant);
		}
	}

	public void displayCarAtIndex(int indexToDisplay) {
		if (indexToDisplay >= 0 && indexToDisplay < 5) {
			System.out.println("car at index: " + indexToDisplay);
			CarDTO refCar = this.cars[indexToDisplay];
			System.out.println(refCar.getModel());
			System.out.println(refCar.getPrice());
			System.out.println(refCar.getVariant());

		}
	}

	public void displayCarByModel(String model) {
		if (model != null) {
			System.out.println("searching for model " + model);
			boolean carFound = false;
			for (int index = 0; index < this.cars.length; index++) {
				CarDTO refOfCar = this.cars[index];
				String localModel = refOfCar.getModel();
				if (localModel.equals(model)) {
					System.out.println("car is found");
					System.out.println(refOfCar.getPrice());
					System.out.println(refOfCar.getVariant());
					carFound = true;
					break;
				}
			}
			if (carFound == false) {
				System.out.println(model + " car is not found");
			}
		}
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public ManagerDTO getManagerDTO() {
		return managerDTO;
	}

	public CarDTO[] getCars() {
		return cars;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}
}