package com.xworkz.bakery;

import com.xworkz.bakery.browser.Browser;

public class BrowserTester {

	public static void main(String[] args) {
		Browser browser = new Browser();

		browser.setName("IE");

		System.out.println(browser.getName());
		
		//class-name/parent-class-name ref=new Constrctor();
		
		Object genericBrowser=new Browser();

		Browser childRef=(Browser)genericBrowser;
		childRef.setName("IE-8");
		System.out.println(childRef.getName());
		
		
		Object day=new String("TUESDAY");
		
		String string=(String)day; //type-casting
		
	}

}
