package com.xworkz.basic;

public class Amazon {
	private static String[] items = { "Mobile", "Watch", "Shoes", "Dress", "Books", "Grociers", "Bedding set",
			"Kitchen Applicanes", "Cosmetics", "Jewelleries", "headphones", "Electronic items", "Furniture",
			"Suitcsaes", "Bag packs", "Sun Glasses", "Gift cards", "Laptop", "Home decor's" };


	public static void search(String product) 
{
		System.out.println("search invoked");
		System.out.println("Total items available" + items.length);
		System.out.println("arg1 :" + product);
		boolean itemFound = false;
		
		for (int count = 0; count < items.length; count++) 
		{
			String item = items[count];
			if (item.equals(product))
			{
				itemFound = true;
				break;
			} 
			else 
			{
				itemFound = false;
			}
		}

		if (itemFound)
		{
			System.out.println("item  found ");
		} 
		else
		{
			System.out.println("item  not found");
		}
		
		System.out.println("search Exit");
	}

	public static int totalItems() 
	{
		return items.length;
	}

}
