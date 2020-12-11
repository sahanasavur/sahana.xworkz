package com.xworkz.data.dto;

import java.util.Date;

public class FileDTO {

	private String name;
	private double size;
	private String type;
	private String location;
	private Date createdDate;

	public FileDTO() {
		System.out.println("Invoked DTO");
	}

	public FileDTO(String name,Date createdDate) {
		this.name = name;
		this.createdDate = createdDate;
	}

	public FileDTO(double size,String type) {
		this.size = size;
		this.type = type;
	}

	public FileDTO(String name, double size, String type, String location, Date createdDate) {
		this.name = name;
		this.createdDate = createdDate;
		this.location = location;
		this.size = size;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	//

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



	public void setLocation(String location2) {
		// TODO Auto-generated method stub
		
	}


}

