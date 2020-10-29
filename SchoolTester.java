public class SchoolTester
{
    public static void main(String[] set)
    {
	    System.out.println("JVM invoked main");	
	    System.out.println("main method set length :" +set.length);	
        
	    String test="song";
		School.bell(test);

		School.bell(test,"pen");
		
	    School.bell(1,test);
		
		School.bell(500000,test);
		
		School.bell(5.00f,test);
		
        School.bell(6.0000000d,test);
		
		School.bell(true,test);
		
	    System.out.println("EXIT :: main");	
		
    }

}