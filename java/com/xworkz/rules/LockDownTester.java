package com.xworkz.rules;

import com.xworkz.rules.covid.CoronaLockDown;
import com.xworkz.rules.covid.LockDown;

public class LockDownTester {

	public static void main(String[] args) {
		CoronaLockDown coronaLockDown = new LockDown();

		System.out.println(coronaLockDown.socialDistance());
		coronaLockDown.mask();
		System.out.println(coronaLockDown.sanitizer());
	}

}
