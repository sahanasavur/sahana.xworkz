package com.xworkz.basic;

public class Bus {
	
		private static String[] places={"SAVANUR","HAVERI","HUBLI","GADAG","BENGALURU"};
		
		public static void search(String place) {
			System.out.println("Total number of places available :" + places.length);
			System.out.println("Place :" + place);		
			
			boolean placeFound = false;
			
			for (int count = 0; count < places.length; count++) 
			{
				String ooru = places[count];
				if (ooru.equals(place))
				{
					placeFound = true;
					break;
				} 
				else 
				{
					placeFound = false;
				}
			}
			if (placeFound) 
			{
				System.out.println("place is found ");
			}
			else
			{
				System.out.println("place is not found");
			}
		}
		public static int totalPlaces() 
		{
			return places.length;
		}
	}


