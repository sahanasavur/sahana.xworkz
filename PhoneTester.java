package com.xworkz.basic.object;

import com.xworkz.basic.object.Phone;

public class PhoneTester {

	public static void main(String[] args)
	{

				Phone.battery="lithium-ion battery";
				
				Phone mob1=new Phone();
				mob1.modelName="Nokia C3";
				mob1.price="7499";
				mob1.colorOfModel="Slate Grey";
				mob1.yearOfRelease="04/08/2020";
				mob1.displayInfo();			
				System.out.println(" ");
				
				Phone mob2=new Phone();
				mob2.modelName="Nokia 5.3";
				mob2.price="12499";
				mob2.colorOfModel="Charcol";
				mob2.yearOfRelease="24/07/2020";
				mob2.displayInfo();		
				System.out.println(" ");
				
				Phone mob3=new Phone();
				mob3.modelName="Nokia 6.2";
				mob3.price="12168";
				mob3.colorOfModel="Ceramic Grey";
				mob3.yearOfRelease="05/09/2019";
				mob3.displayInfo();
				System.out.println(" ");
				
				Phone mob4=new Phone();
				mob4.modelName="Nokia 7.2";
				mob4.price="16399";
				mob4.colorOfModel="Ice Blue";
				mob4.yearOfRelease="06/09/2019";
				mob4.displayInfo();
				System.out.println(" ");
				
				
				Phone mob5=new Phone();
				mob5.modelName="Nokia 8.1";
				mob5.price="14999";
				mob5.colorOfModel="Night Red";
				mob5.yearOfRelease="20/12/2018";
				mob5.displayInfo();
				System.out.println(" ");

		}


	}

