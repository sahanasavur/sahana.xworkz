package com.xworkz.Constructor;
import com.xworkz.Constructor.Season;

@SuppressWarnings("unused")
public class SeasonTester {

	public static void main(String args[])
	{
		Season seasons=new Season("SUMMER","APRIL");
		
		System.out.println(seasons.name);	
	    System.out.println(seasons.startMonth);
	}
	    
}
