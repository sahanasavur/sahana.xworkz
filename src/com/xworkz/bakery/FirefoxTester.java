package com.xworkz.bakery;

import com.xworkz.bakery.browser.Browser;
import com.xworkz.bakery.browser.Firefox;

public class FirefoxTester {

	public static void main(String[] args) {
		Object generic = new Firefox();

		Browser browser = new Firefox();

		Firefox firefox = new Firefox();

		// instanceOf
		generic = new String("test");
		if (generic instanceof Firefox) {
			System.out.println("yes it is fire fox");
			Firefox fireFoxCasted = (Firefox) generic;
			System.out.println(firefox.getName());

		} else {
			System.out.println("It is not fire fox");
		}
	}

}
