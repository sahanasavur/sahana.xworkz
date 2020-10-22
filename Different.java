public class Different{	
	public static void main(String[] ant)
	{
		System.out.println("JVM invokes main");		
		String[] statesArray={"Karnataka","Harayan","Manipur","Gujarat","Assam","Bihar","AdrharPradesh","Odisha","Nagaland","Meghalaya","Mizoram","Maharashtra",
		"Kerala","Goa","Jammu & Kashimir"};
		
		statesOfIndia(statesArray);	
		
		System.out.println("exit main ");
	}		
	public static void statesOfIndia(String[] state)
	{
		int size=state.length;
		System.out.println(size);
		System.out.println("statesOfIndia "+ state);		

		
		System.out.println("statesOfIndia @ index 0 "+state[0]);
		System.out.println("statesOfIndia @ index 2 "+state[2]);
		System.out.println("statesOfIndia @ index 4 "+state[4] );
		System.out.println("statesOfIndia @ index 6 "+state[6]);
		System.out.println("statesOfIndia @ index 8 "+state[8]);
		System.out.println("statesOfIndia @ index 10 "+state[10] );

	}
	}