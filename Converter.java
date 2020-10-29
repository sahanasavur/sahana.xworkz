public class Converter
{
	public static void main (String[] values)
	{
		System.out.println("JVM invoked main ");
		System.out.println("The program will convert String to number ");
	
        String classNum="1";
		byte convertClassNum=Byte.parseByte(classNum);
		System.out.println("converted byte :" +convertClassNum);
	
		String doorNum="123";
		short convertDoorNum=Short.parseShort(doorNum);
		System.out.println("converted short :" +convertDoorNum);
		
		String mobilebill="25000";
		int convertMobileBill=Integer.parseInt(mobilebill);
		System.out.println("converted int :" +convertMobileBill);
		
		String mobileNum="8197425810";
		long convertMobileNum=Long.parseLong(mobileNum);
		System.out.println("converted long :" +convertMobileNum);
		
		String percentage="93.28";
		float convertPercentage=Float.parseFloat(percentage);
		System.out.println("converted float :" +convertPercentage);
		
		String speedOfLight="300000000";
        double convertspeedOfLight=Double.parseDouble(speedOfLight);
		System.out.println("converted float :" +convertspeedOfLight);

	    String isJavaFun=true;
        boolean convertIsJavaFun=Boolean.parseBoolean(isJavaFun);
	    System.out.println(" converted boolean :"+convertIsJavaFun);
		
		String division="B";
		char convertedDivision=division.charAt(0);
		System.out.println("converted character: "+convertedDivision);

		
	}
}