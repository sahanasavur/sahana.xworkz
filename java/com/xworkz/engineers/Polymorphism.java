package com.xworkz.engineers;

import com.xworkz.engineers.engineer.CSEngineer;
import com.xworkz.engineers.engineer.ECEngineer;
import com.xworkz.engineers.engineer.Engineer;

public class Polymorphism {

	public static void main(String[] args) {
			Engineer engineer=new CSEngineer();
			Engineer engineer1=new ECEngineer();
			
			engineer.problemSolving();
			engineer1.problemSolving();

	}
}
