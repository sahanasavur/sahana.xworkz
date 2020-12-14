package com.xworkz.car;
import com.xworkz.car.carshowroom.Showroom;
import com.xworkz.car.manager.ManagerDTO;

public class ShowroomTester {

			public static void main(String[] args) {

				Showroom carShowroom = new Showroom();
				System.out.println(" ");

				carShowroom.addManager("SAHANA", 8197425810l);
				carShowroom.displayManager();
				System.out.println(" ");

				carShowroom.removeManager();
				carShowroom.displayManager();
				System.out.println(" ");

				ManagerDTO managerDTO = new ManagerDTO("AISHU", 9448390334l);
				carShowroom.updateManager(managerDTO);
				carShowroom.displayManager();
				System.out.println(" ");


				ManagerDTO managerDTO2 = new ManagerDTO("SANA");
				carShowroom.addManager(managerDTO2);
				carShowroom.displayManager();
				
				ManagerDTO managerDTO3 = new ManagerDTO(1234567890l);
				carShowroom.addManager(managerDTO3);
				carShowroom.displayManager();

			}
	}


