package com.xworkz.engineers.engineer;

import com.xworkz.engineers.constants.Branch;

public class ECEngineer extends Engineer{
	public Branch branch = Branch.EC;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in ECEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public void buildCircuit() {
		System.out.println("invoked buildCircuit in EC");
	}

	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
}
}