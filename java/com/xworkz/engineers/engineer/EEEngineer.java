package com.xworkz.engineers.engineer;

import com.xworkz.engineers.constants.Branch;

public class EEEngineer extends Engineer {
	public Branch branch = Branch.EEE;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in EEEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public void playwithcurrent() {
		System.out.println("invoked playwithcurrent in EE");
	}

	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
}
}
