package com.xworkz.Constructor.constructorEncapsulate;
import  com.xworkz.Constructor.constructorEncapsulate.Temple;
@SuppressWarnings("unused")
public class TempleTester {

	public static void main(String[] args) {

		
				Temple temple = new Temple("Venkateshwar", "Lakshmeshwar", 7.00f, "Laddu", 8.00f);
				System.out.println("Temple name: " + temple.getName());
				System.out.println("Temple location: " + temple.getLocation());
				System.out.println("Temple open time: " + temple.getOpenTime() + "AM");
				System.out.println("Temple prasada: " + temple.getPrasada());
				System.out.println("Temple close time: " + temple.getCloseTime() + "PM");		
				temple.setPrasada("Puliyogare");
				String prasada=temple.getPrasada();
				System.out.println("updated prasada: "+prasada);
				

			}
	}


