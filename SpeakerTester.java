package com.xworkz.methods.electronics;
import com.xworkz.methods.electronics.Speaker;

@SuppressWarnings("unused")
public class SpeakerTester {

	public static void main(String[] args)
	{
		
				Speaker speaker= new Speaker("BLACK", 6);
				System.out.println(speaker.getCompanyName());
				
				System.out.println(speaker.isConnected());
				
				speaker.increaseVolume();
				speaker.onOrOff();
				
				speaker.increaseVolume();
				speaker.increaseVolume();
				speaker.increaseVolume();
				speaker.increaseVolume();
			
				speaker.onOrOff();
	
				speaker.decreaseVolume();
				
				speaker.onOrOff();
				
				speaker.decreaseVolume();
				speaker.decreaseVolume();
				speaker.decreaseVolume();
				speaker.decreaseVolume();
				speaker.decreaseVolume();

	}

}
