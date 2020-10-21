  
public class Boolean{
	public static void main(String[] args)
	{
		System.out.println("Invoked by JVM");	
		arrayOfBoolean();
		System.out.println("End of main method by JVM");
	}
	
	public static void arrayOfBoolean()
	{
		System.out.println("Invoking Method Array Of Boolean Types");
		
		boolean earthIsFlat=true;
		boolean rainbowIsColourless=false;
		boolean sunIsCool=false;
		boolean sugarIsSweet=true;
		
		boolean sets[]={earthIsFlat,rainbowIsColourless,sunIsCool,sugarIsSweet};
		int numberOfArrays=sets.length;
		System.out.println("Number of Statements: "+numberOfArrays);
		
		boolean lineAtIndex0=sets[0];
		System.out.println("Stmt at Index0: "+lineAtIndex0);
  
        boolean lineAtIndex1=sets[1];
		System.out.println("Stmt at Index1: "+lineAtIndex1);
		
		boolean lineAtIndex2=sets[2];
		System.out.println("Stmt at Index2: "+lineAtIndex2);
		
		boolean lineAtIndex3=sets[3];
		System.out.println("Stmt at Index3: "+lineAtIndex3);
		
		
	}
}