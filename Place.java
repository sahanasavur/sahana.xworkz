public class Place
{
	public static String town(int distance)
	{
		System.out.println("Invoked town");
		System.out.println("distance "+distance);

		if(distance==0)
		{
			System.out.println("The place is ");
			return "Savanur";
		}		
		if(distance==60)
		{
			System.out.println("The place is ");
			return "Hubli";
		}
		if(distance==230)
		{
			System.out.println("The place is ");
			return "Ballari";
		}
		if(distance==360)
		{
			System.out.println("The place is");
			return "Bengaluru";
		}
		if(distance==400)
		{
			System.out.println("The place is ");
			return "Mangaluru";
		}
		if(distance>=1000000)
		{
			System.out.println("Place :");
			return "Place Not in earth";
		}
		
		return "Place not found";
	}
}