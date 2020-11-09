public class Tester
{
	public static void main(String[] data)
	{
		System.out.println("JVM Invoked main");
		
		ECE[] branch=ECE.values();
		System.out.println("Length of enum ECE: "+branch.length);

		for(int index=0;index<branch.length;index++)
		{	
			ECE EC=branch[index];
			System.out.println("ECE: " + EC);
		}
		System.out.println("*************************");

		
		CSE[] branc=CSE.values();
		System.out.println("Length of enum CSE: "+branc.length);

		for(int index1=0;index1<branc.length;index1++)
		{	
			CSE CS=branc[index1];
			System.out.println("CSE: " + CS);
		}	
		System.out.println("*************************");

		
		ME[] bran=ME.values();
		System.out.println("Length of enum ME: "+bran.length);

		for(int index2=0;index2<bran.length;index2++)
		{	
			ME M=bran[index2];
			System.out.println("ME: " + M);
		}	
    	System.out.println("*************************");
		
		
		CV[] ran=CV.values();
		System.out.println("Length of enum CV: "+ran.length);

		for(int index3=0;index3<ran.length;index3++)
		{	
			CV C=ran[index3];
			System.out.println("CV: " + C);
		}	
    	System.out.println("*************************");	
		
		
		EEE[] an=EEE.values();
		System.out.println("Length of enum EEE: "+an.length);

		for(int index4=0;index4<an.length;index4++)
		{	
			EEE E=an[index4];
			System.out.println("EEE: " + E);
		}
		System.out.println("*************************");
		
		
		ISE[] bar=ISE.values();
		System.out.println("Length of enum ISE: "+bar.length);

		for(int index5=0;index5<bar.length;index5++)
		{	
			ISE I=bar[index5];
			System.out.println("ISE: " + I);
		}	
		System.out.println("*************************");

		
	}		
}
		