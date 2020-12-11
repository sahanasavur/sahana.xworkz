package com.xworkz.data;

import java.util.Date;
import com.xworkz.data.dto.FileDTO;

@SuppressWarnings("unused")
public class FileTester {

	public static void main(String[] args) {
		Date date = new Date();
		FileDTO dto1 = new FileDTO("xworkz.jpg", date);
		FileDTO dto2 = new FileDTO(100, "jpg");
		FileDTO dto3 = new FileDTO("xworkz.jpg", 100, "jpg", "C://images",date);

	System.out.println(dto1.getName());
	System.out.println(dto1.getCreatedDate());
	System.out.println("Printed Constructor 1");
	System.out.println(" ");
	
	System.out.println(dto2.getSize());
	System.out.println(dto2.getType());
	System.out.println("Printed Constructor 2");
	System.out.println(" ");
	
	System.out.println(dto3.getLocation());
	System.out.println("Printed Constructor 3");

}
}