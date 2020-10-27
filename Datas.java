public class Datas
{
	public static void main(String[] confirm)
	{
		System.out.println("main is Invoked by JVM");
		
		String h1=AgeDefine.ageData(1);
		System.out.println("Human is "+h1);
		
		String h2=AgeDefine.ageData(12);
		System.out.println("Human is "+h2);
		
		String h3=AgeDefine.ageData(18);
		System.out.println("Human is "+h3);
		
		String h4=AgeDefine.ageData(35);
		System.out.println("Human is "+h4);
		
		String h5=AgeDefine.ageData(68);
		System.out.println("Human is "+h5);
		
		String h6=AgeDefine.ageData(123);
		System.out.println("Human is "+h6);
		
		System.out.println("Exit:: main");
		
	}
}