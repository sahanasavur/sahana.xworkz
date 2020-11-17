package com.xworkz.basic;

public class PhoneDirectory 
{
	private static long[] numbers = {8197425810L,9448390334L,8855220014L,74115258890L};
	
	public static void search(long num) 
	{
			System.out.println("search invoked");
			System.out.println("Total numbers available" + numbers.length);
			System.out.println("arg1 :" + num);
			boolean numberFound = false;		
			
			for (int count = 0; count < numbers.length; count++) 
			{
				long phone= numbers[count];
				if (phone==numbers[count])
				{
					numberFound = true;
					break;
				} 
				else 
				{
					numberFound = false;
				}
			}
			
			if (numberFound)
			{
				System.out.println("number  found ");
			} 
			else
			{
				System.out.println("number  not found");
			}
			
			    System.out.println("search Exit");
		}

		public static long totalNumbers() 
		{
			return numbers.length;
		}

	}
	