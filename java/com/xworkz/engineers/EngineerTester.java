package com.xworkz.engineers;

import com.xworkz.engineers.engineer.CSEngineer;
import com.xworkz.engineers.engineer.CivilEngineer;
import com.xworkz.engineers.engineer.ECEngineer;
import com.xworkz.engineers.engineer.EEEngineer;
import com.xworkz.engineers.engineer.Engineer;
import com.xworkz.engineers.engineer.MechEngineer;

public class EngineerTester {

	public static void main(String[] args) {
		Engineer engineer = new Engineer();
		System.out.println(engineer.USN);
		System.out.println(engineer.branch);
		engineer.problemSolving();
		System.out.println(" ");

		CSEngineer csEngineer = new CSEngineer();
		System.out.println(csEngineer.USN);
		System.out.println(csEngineer.getBranch());
		System.out.println(csEngineer.getParentBranch());
		csEngineer.problemSolving();
		System.out.println(" ");

		ECEngineer ecEngineer = new ECEngineer();
		System.out.println(ecEngineer.USN);
		System.out.println(ecEngineer.getBranch());
		System.out.println(ecEngineer.getParentBranch());
		ecEngineer.problemSolving();
		ecEngineer.buildCircuit();
		System.out.println(" ");

		EEEngineer eeEngineer = new EEEngineer();
		// System.out.println(eeEngineer.USN);
		System.out.println(eeEngineer.getBranch());
		System.out.println(eeEngineer.getParentBranch());
		eeEngineer.problemSolving();
		eeEngineer.playwithcurrent();
		System.out.println(" ");

		CivilEngineer cvEngineer = new CivilEngineer();
		System.out.println(cvEngineer.getBranch());
		System.out.println(cvEngineer.getParentBranch());
		cvEngineer.problemSolving();
		cvEngineer.planning();
		System.out.println(" ");

		MechEngineer meEngineer = new MechEngineer();
		System.out.println(meEngineer.getBranch());
		System.out.println(meEngineer.getParentBranch());
		meEngineer.problemSolving();
		meEngineer.designmachine();
		;

	}

}
