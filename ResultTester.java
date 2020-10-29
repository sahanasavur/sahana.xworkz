public class ResultTester
{
	public static void main(String[] up)
	{
	    System.out.println("main Invoked by JVM");
		
	    String results=up[0];		
	    float undo=Float.parseFloat(results);

	    String resultType=ResultCondition.resultDef(undo);
	
    	System.out.println("Result type :" +resultType);
	
    	System.out.println("EXIT :: main");
	}
}