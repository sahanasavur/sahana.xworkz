package com.xworkz.string;

public class Name {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String name = "SAHANA";
		Name obj = new Name();

		String address = null;
		if (name == address) {
			System.out.println("Two different reference variable are poiniting to the same object");
		} else {
			System.out.println("Two different reference variable are poiniting to the different object");
		}
		System.out.println(" ");

		System.out.println(name.charAt(3));
		System.out.println(" ");


		System.out.println(name.length());
		System.out.println(" ");

		System.out.println(name.toCharArray());
		System.out.println(" ");

		String value = name.toLowerCase();
		System.out.println(value);

		System.out.println(" ");

		String concat = name + " Aishu";
		System.out.println(concat);
		System.out.println(" ");

		boolean empty = name.isEmpty();
		System.out.println(empty);
		System.out.println(" ");

		String space = name.replace("-", " ");
		System.out.println(space);
		System.out.println(" ");

		int index = name.indexOf("H");
		System.out.println(index);
		System.out.println(" ");

		boolean find = space.contains(" ");
		System.out.println(find);
		System.out.println(" ");

		String replace = name.replaceAll("SAHANA", "xworkz");
		System.out.println(replace);
		System.out.println(" ");

		String sub = space.substring(1);
		System.out.println(sub);
		System.out.println(" ");

		String subString = space.substring(0, 4);
		System.out.println(subString);
		System.out.println(" ");
	
		String concatUsingMethod = name;
		int indexCount=concatUsingMethod.codePointCount(0,3);
		System.out.println(indexCount);
	
	
	}

}
