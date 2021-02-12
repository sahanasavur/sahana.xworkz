package com.xworkz.celebrate;

import com.xworkz.celebrate.service.DisplayService;
import com.xworkz.celebrate.service.DisplayServiceImpl;

public class TesterLakshmi {

	public static void main(String[] args) {
		DisplayService service = new DisplayServiceImpl();

		service.printString((l, t) -> {
			System.out.println("validating" + l + " t" + t);
			if (l.contains("a") || l.contains("A")) {
				System.out.println(l + " " + l.hashCode());
			}
		});
	}

}
