  
public class ResultCondition
{
	public static String resultDef(double result)
	{
		System.out.println("Invoking resultDefine");
		
		if(result>80 && result<=100)
		{
			System.out.println("Result is: "+result);
			return "Distinction";
		}
		
		if(result>60 && result<=80)
		{
			System.out.println("Result is: "+result);
			return "first class";
		}
		
		if(result>=50  && result<= 60)
		{
			System.out.println("Result is: "+result);
			return "Second class";
		}
		
		if(result>35  &&  result<=49)
		{
			System.out.println("Result is: "+result);
			return "Third class";
		}
		
		if(result<=35)
		{
			System.out.println("Result is: "+result);
			return "Fail";
		}
		return "Exit";
	}
}
