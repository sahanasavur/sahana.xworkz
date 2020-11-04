public class BrandTester
{
	public static void main(String[] brand)
	{
		System.out.println("JVM invoked main");
		CarBrand.go(brand);
		System.out.println("Exit:: main");
	}
}