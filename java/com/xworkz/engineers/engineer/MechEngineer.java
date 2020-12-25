package com.xworkz.engineers.engineer;

import com.xworkz.engineers.constants.Branch;

public class MechEngineer extends Engineer {

	public Branch branch = Branch.MECH;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in MechEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public void designmachine() {
		System.out.println("invoked designmachine in Mech");
	}

	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
}
}
