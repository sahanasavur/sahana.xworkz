package com.xworkz.engineers.engineer;

import com.xworkz.engineers.constants.Branch;

public class CivilEngineer extends Engineer{
	public Branch branch = Branch.CIVIL;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in CivilEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public void planning() {
		System.out.println("invoked planning in Mech");
	}

	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
}
}
