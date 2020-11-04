public class Country
{
	public static void CountryNames(String[] name)
	{
		System.out.println("Invoked CountryNames");
		
		for(int run=0;run<name.length;run++)
		{
			System.out.println("index value: "+run);
			String place=name[run];
			System.out.println("country names: "+place);
		}
	}
}
