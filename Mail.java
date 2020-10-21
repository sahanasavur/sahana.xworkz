public class Mail
{
	
	public static void main(String[] pen)
	{
		System.out.println("invoked main method by JVM");
		arrayOfEmail();
		System.out.println("exiting main method by JVM");
	}
		
	public static void arrayOfEmail()
	{
		 System.out.println("invoked array of email");
	
		 String myEmail="sahana.xworkz@gmail.com";
		 String sirEmail="0";
		 String mamEmail="mam.xworkz@gmail.com";
	     
	     String[] emails={myEmail,sirEmail,mamEmail};
		 int sizeOfArray=emails.length;
		 System.out.println("Total elements "+sizeOfArray);
		 
		 
		 String elementAtIndex0=emails[0];
		 System.out.println("Element at index 0: "+elementAtIndex0);
		 
		 String elementAtIndex1=emails[1];		 
		 System.out.println("Element at index 1: "+elementAtIndex1);
		 
		 String elementAtIndex2=emails[2];	 
		 System.out.println("Element at index 2: "+elementAtIndex2);
	
	}
}