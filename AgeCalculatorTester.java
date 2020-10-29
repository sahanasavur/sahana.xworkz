public class AgeCalculatorTester
{
	public static void main(String[] args)
	{	
	System.out.println("JVM invoked main");
	
	String ageInString=args[0];	
	byte age=Byte.parseByte(ageInString);

	String ageType=AgeCalculator.ageDefinition(age);
	
	System.out.println("Age type :" +ageType);
	
	System.out.println("EXIT :: main");
	}
}