public class Percent
{
	public static void main(String[] five)
	{
		System.out.println("invoked main method");
		arrayOfPercent();
		System.out.println("exiting main method");
	}
		
	public static void arrayOfPercent()
	{
		System.out.println("invoked array of percent");
	
		float mypercent=93.28f;
        float pupercent=85.66f;
	    float degreercent=70.00f;
	    
		float[] percent={93.28f,85.66f,70.00f};
		float sizeOfArray=percent.length;
		 System.out.println("Total elements "+sizeOfArray);
		 	 
		float elementAtIndex0=percent[0];
		 System.out.println("Element at index 0: "+elementAtIndex0);
		 
		float elementAtIndex1=percent[1];		 
		 System.out.println("Element at index 1: "+elementAtIndex1);
		 
		float elementAtIndex2=percent[2];	 
		 System.out.println("Element at index 2: "+elementAtIndex2);
		 
	}
}