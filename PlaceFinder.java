public class PlaceFinder{
	
	public static void main(String[] ms)
	{
		System.out.println("Main Invoked by JVM");
	
		String distanceInString=ms[0];
		
	    int dist=Integer.parseInt(distanceInString) ;
		String Distance=Place.town(dist);
		
		System.out.println(Distance);
		
		System.out.println("Exit:: main");

	}
}