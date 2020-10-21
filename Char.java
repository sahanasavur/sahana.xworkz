public class Char
{
	public static void main(String[] ten)
	{
		System.out.println("invoked main method");
		arrayOfChar();
		System.out.println("exiting main method");
	}
		
	public static void arrayOfChar()
	{
		System.out.println("invoked array of char");
	
		char sslcgrade='A';
        char pugrade='B';
	    char degreegarde='C';
		char sahana='S';
		char apple='A';
		char hat='H';
		char ant='A';
		char nut='N';
		char axe='A';
		char zebra='Z';
		
		char[] grades={sslcgrade,pugrade,degreegarde,sahana,apple,hat,ant,nut,axe,zebra};
		
		int sizeOfArray=grades.length;
		System.out.println("Number of characters in Array: "+sizeOfArray);
		
		char characterAtIndex0=grades[0];
		 System.out.println("character at index 0: "+characterAtIndex0);
		 
		char characterAtIndex2=grades[2];		 
		 System.out.println("character at index 2: "+characterAtIndex2);
		 
		char characterAtIndex4=grades[4];	 
		 System.out.println("character at index 4: "+characterAtIndex4);
		
		char characterAtIndex6=grades[6];		 
		 System.out.println("character at index 6: "+characterAtIndex6);
		 
		char characterAtIndex8=grades[8];	 
		 System.out.println("character at index 8: "+characterAtIndex8);
		
	}

}