package com.xworkz.engineers.engineer;

import com.xworkz.engineers.constants.Branch;

public class ISEngineer extends Engineer {
	public Branch branch = Branch.IS;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in ISEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public void writecode() {
		System.out.println("invoked writecode in IS");
	}

	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
}
}
