public class TheaterFinder
{
	public static void main(String[] names)
	{
		System.out.println("Invoked main");
		
		bestTheater(Theater.INOX);
		
		System.out.println("EXIT :: main");
	}
	
	public static void bestTheater(Theater theaterName)
	{
		System.out.println("Invoked bestTheater");
		
		switch(theaterName)
		{
			case PVR:
				System.out.println("case is "+theaterName);
				System.out.println("Rating of the "+theaterName+ " theater is GOOD");
				break;
			
			case APSARA:
				System.out.println("case is "+theaterName);
				System.out.println("Rating of the "+theaterName+ " theater is AVERAGE");
				break;
				
			case CINEPOLIS:
				System.out.println("case is "+theaterName);
				System.out.println("Rating of the "+theaterName+ " theater is BETTER");
				break;
				
			case INOX:
				System.out.println("case is "+theaterName);
				System.out.println("Rating of the "+theaterName+ " theater is BEST");
				break;
	
		}
		System.out.println("EXIT :: bestTheater");	
	}
}