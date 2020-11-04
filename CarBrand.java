public class CarBrand
{
	public static void go(String[] set)
	{
		System.out.println("go method invoked");	
		String[] carBrand={"HUNDAI","BMW","AUDI","KIA","TOYOTA"};
		
		System.out.println("Brand size : "+carBrand.length);
		
		for(int brand=0;brand<carBrand.length;brand++)
		{
			System.out.println("Brands count :"+brand);
			String msg=carBrand[brand];
			System.out.println("Car Brand : "+ msg);
		}

	}
}