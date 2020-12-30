package com.xworkz.inheritance;

import com.xworkz.inheritance.states.KarnatakaGoverment;
import com.xworkz.inheritance.scheme.UnionGovernment;

public class StateTester {

	public static void main(String[] args) {
		UnionGovernment government = new KarnatakaGoverment();
		government.atalPensionYogana();

	}

}
