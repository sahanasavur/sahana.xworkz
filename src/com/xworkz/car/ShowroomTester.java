package com.xworkz.car;
import com.xworkz.car.carshowroom.Showroom;
import com.xworkz.car.manager.ManagerDTO;

public class ShowroomTester {

			public static void main(String[] args) {

				Showroom carShowroom = new Showroom();
				System.out.println(" ");


						carShowroom.addManager("Sahana", 1234567890l);
						carShowroom.displayManager();
						carShowroom.removeManager();
						carShowroom.displayManager();
						System.out.println("  ");
						
						ManagerDTO dto=new ManagerDTO("Aishu", 720432);
						carShowroom.addManager(dto);
						carShowroom.displayManager();
						System.out.println("  ");
						carShowroom.updateManager(7829731400l);
						System.out.println("  ");
						

			}
	}


