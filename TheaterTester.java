package com.xworkz.methods.Movie;

import java.util.Arrays;
import com.xworkz.methods.Movie.Theater;

@SuppressWarnings("unused")
public class TheaterTester {

	public static void main(String[] args) {

		String[] movieNames = { "PK", "Chennai Express", "KGF", "Departed", "Zodiac", "KGF2", "Inception",
				"Interstellar", "Yajamana" };

		Theater movieHub = new Theater("Navrang", 500, movieNames);
		System.out.println(movieHub.getTheaterName());
		System.out.println(movieHub.getTotalTickets());
		String convertedMovieNames = Arrays.toString(movieHub.getMovieNames());
		System.out.println(convertedMovieNames);

		double price = movieHub.bookTicketsAndGetTotalPrice("KGF", 4, "SAHANA");
		System.out.println("************" + price);

		movieHub.bookTicketsAndGetTotalPrice("KGF2", 4, "X-workz");

		Theater movieH = new Theater("PVR", 3, movieNames);
		double price1 = movieH.buySnacks("Chips", 3, true, null);
		System.out.println("cost of snack is :" + price1);
		
		Theater movieH1 = new Theater("PVR", 2, movieNames);
		double price2 = movieH1.buySnacks("Pop Corn", 2, true, null);
		System.out.println("cost of snack is :" + price2);
		
		
		String[] snacks = movieH.getSnacksList();
		for (int s = 0; s < snacks.length; s++) {
			System.out.println(snacks[s]);
		}
	}
}
