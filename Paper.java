package com.xworkz.Constructor.constructorEncapsulate;

public class Paper
{
		
		private String brand="CLASSMATE";
		 float width;
		 float height;
		public String color;
		
		public Paper(float width,float height,String color) 
		{		
			this.width=width;
			this.height=height;
			this.color=color;			
		}
		
		public String getBrand() {
			return brand;
		}
		
}
