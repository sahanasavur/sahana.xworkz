public class Festiv{	
	public static void main(String[] politicians)
	{
		System.out.println("JVM invokes main");		
		String[] ministersArray={"BSY","HDK","Siddaramiah","Jagadish Shettar","SM Krishna"};
		chiefMinisters(ministersArray);	
	   //chiefMinisters(null);		
		System.out.println("exit main ");
	}
	
	public static void chiefMinisters(String[] names)
	{
		
		System.out.println("cheifMinisters "+ names );		
		int size=names.length;
		System.out.println(size);
		String elementATIndex0=names[0];
		System.out.println("Chief Minister @ index 0 "+elementATIndex0);
		System.out.println("Chief Minister @ index 1 "+elementATIndex1);
		System.out.println("Chief Minister @ index 0 "+names[0]);
		System.out.println("Chief Minister @ index 1 "+names[1]);
	}
}