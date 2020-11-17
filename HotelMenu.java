package com.xworkz.basic;

public class HotelMenu 
{

		private static String[] items = {"CHATS","VEG BIRIYANI","SOUPS","MEALS","CHICKEN BIRIYANI"};
		
		public static void search(String item) 
		{
			System.out.println("Total items available : " + items.length);
			System.out.println("ITEM :" + item);
			
			boolean itemFound = false;
			
			for (int count = 0; count < items.length; count++)
			{
				String menu = items[count];
				if (menu.equals(item))
				{
					itemFound = true;
					break;
				} 
				else {
					itemFound = false;
				}
			}
			if (itemFound)
			{
				System.out.println("item is found ");
			} 
			else 
			{
				System.out.println("item is not found");
			}
		}
		public static int totalItems()
		{
		return items.length;
		}

	}

