public class CountryTester
{
	public static void main(String[] arg)
	{
		System.out.println("Invoke main method");
		System.out.println("country name  : "+Country.countryName);
		int large=Country.discoveredAgo;
		System.out.println("discoveredAgo : "+large);
		System.out.println("No of states : "+Country.noOfStates);
		System.out.println("largestCountry : "+Country.largestCountry);
		System.out.println("stateName is : "+Country.stateName);
	}
}