public class IPhone{
	
	public static boolean call()
	{		
		System.out.println("invoked call");
		boolean connected=false;
		return connected;
	}

	
	public static byte charging(double volts)
	{		
		System.out.println("invoked charging()");
		System.out.println("Volts : "+volts);
		if(volts>3){
			
			System.out.println("volts is greater than 3");
			return 100;
		}
		
		if(volts<3 && volts>0){
			
			System.out.println("volts is lesser than 3");
			return 0;
		}
		
		return -1;
	}
	
}