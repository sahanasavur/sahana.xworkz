public class BranchTester
{
	public static void main(String[] test)
	{
		System.out.println("JVM Invoked main");
		
		String branch="ECE";
		Branches convert=Branches.valueOf(branch);
		System.out.println("The branch is : "+branch);
		
		Branches[] br=Branches.values();
		System.out.println(br.length);
		
		
		for(int step=0;step<br.length;step++)
		{
			System.out.println("index " + step);
			
			Branches brtop=br[step];
			System.out.println("Branch enum Value " + brtop);	
		}
		
		System.out.println("EXIT :: main");
	}
}		

