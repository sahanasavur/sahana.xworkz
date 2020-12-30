package com.xworkz.inheritance;

import com.xworkz.inheritance.scheme.RawMaterial;
import com.xworkz.inheritance.states.AluminiumRawMaterial;
import com.xworkz.inheritance.states.CopperRawMaterial;

public class RawMaterialTester {

	public static void main(String[] args) {
		RawMaterial material = new AluminiumRawMaterial();
		material.delivery();
		material.manufacture();

		RawMaterial material2 = new CopperRawMaterial();
		material2.manufacture();

	}
}
