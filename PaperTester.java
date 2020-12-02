package com.xworkz.Constructor.constructorEncapsulate;

public class PaperTester {

	public static void main(String[] args) 
	{			
				Paper paper=new Paper(24.77f,20.96f,"WHITE");
				System.out.println("brand: "+paper.getBrand());
				System.out.println("paper width: "+paper.height+"cm");
				System.out.println("paper height: "+paper.width+"cm");
				System.out.println("paper color: "+paper.color);

			}
	}


