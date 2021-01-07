package com.xworkz.rules.covid;

public class LockDown implements CoronaLockDown {

	@Override
	public int socialDistance() {
		System.out.println("Implemented socialDistance ");
		return 6;
	}

	@Override
	public void mask() {
		System.out.println("Implemented mask ");
	}

	@Override
	public String sanitizer() {
		System.out.println("Implemented sanitizer ");
		return "Dettol";
	}
}
