package com.xwork.cricket.event;

import com.xwork.cricket.playerDTO.PlayerDTO;

public class PlayerService {

	public void showDetails(PlayerDTO dto) {
		String name = null;
		int jreserNo = 0;
		String sport = null;
		
		try {
			System.out.println("start of try");
			name = dto.getName();
			jreserNo = dto.getJerseyNumber();
			sport = dto.getSport();
			int[] a = { 1 };
			System.out.println(a[0]);
			System.out.println("end of try");
		} 
		catch (NullPointerException np) {
			System.out.println("this is cathing NullPointerException");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("this is cathing ArrayIndexOutOfBoundsException");
		}
		System.out.println("after try and catch");
		System.out.println(name);
		System.out.println(jreserNo);
		System.out.println(sport);
	}
}
