package com.xworkz.bakery.cake;

public class Cake {

	private String flavour="Chocolate";
	private String shape="Round";
	private double size=1.0;

	public boolean taste() {
		boolean tasteIsGood = true;
		return  tasteIsGood;

	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

}
