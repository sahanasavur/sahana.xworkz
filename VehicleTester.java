package com.xworkz.Constructor.constructorEncapsulate;
import com.xworkz.Constructor.constructorEncapsulate.Vehicle;

@SuppressWarnings("unused")
public class VehicleTester
{

	public static void main(String[] args) 
	{


			@SuppressWarnings("unused")
			Object color;

         		Vehicle vehicle=new Vehicle(2016,"ROYAL ENFIELD",7792);

				int mfgDate=vehicle.getMfgDate();
				String company=vehicle.getCompany();
				int chasisNo=vehicle.getChasisNo();

				
				System.out.println(mfgDate);
				System.out.println(company);
				System.out.println(chasisNo);

				
			    String color1="BLACK";
				vehicle.setColor(color1);

				String ownerName="B S SAVUR";
				vehicle.setOwnerName( ownerName);
			
			}

		}