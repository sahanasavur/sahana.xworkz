public class BookTester
{
    public static void main(String[] thing)
    {
	    System.out.println("JVM invoked main");	
	    System.out.println("main method thimg length :" +thing.length);	
        
	    String lines="Paper";
		Books.keep(lines);

		Books.keep(lines,"pen");
		
	    Books.keep(lines,1);
		
		Books.keep(lines,500000);
		
		Books.keep(lines,5.00f);
		
        Books.keep(lines,5.0000000000d);
		
		Books.keep(lines,true);
		
		Books.keep(5.0000000000d,500000);
		

	    System.out.println("EXIT :: main");	
		
    }

}