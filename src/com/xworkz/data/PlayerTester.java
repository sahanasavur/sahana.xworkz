package com.xworkz.data;
import com.xworkz.data.dto.PlayerDTO;
import java.util.Arrays;
public class PlayerTester {

	public static void main(String[] args) {

		PlayerDTO PlayerDTO = new PlayerDTO();
		PlayerDTO.setName("MS Dhoni");
		PlayerDTO.setCountry("India");
		PlayerDTO.setSports(new String[] { "Cricket" });
		PlayerDTO.setAwards(new String[] { "Padma Bhushan", "Padma Shri", "Khel Ratna" });

		System.out.println(PlayerDTO.getName());
		System.out.println(PlayerDTO.getCountry());
		System.out.println(Arrays.toString(PlayerDTO.getSports()));
		System.out.println(Arrays.toString(PlayerDTO.getAwards()));
		System.out.println(" ");

		PlayerDTO playerDTO2 = new PlayerDTO();
		playerDTO2.setName("Virat Kohli");
		playerDTO2.setCountry("India");
		playerDTO2.setSports(new String[] { "Cricket", "Badminton" });
		playerDTO2.setAwards(new String[] { "Padma Shri", "Khel Ratna", "Arjuna" });

		System.out.println(playerDTO2.getName());
		System.out.println(playerDTO2.getCountry());
		System.out.println(Arrays.toString(playerDTO2.getSports()));
		System.out.println(Arrays.toString(playerDTO2.getAwards()));
		System.out.println(" ");

		PlayerDTO playerDTO3 = new PlayerDTO();
		playerDTO3.setName("AB de Villiers");
		playerDTO3.setCountry("South Africa");
		playerDTO3.setSports(new String[] { "Cricket" });
		playerDTO3.setAwards(new String[] { "ODI player of the year","Sir Garfield Sobers Trophy" });

		System.out.println(playerDTO3.getName());
		System.out.println(playerDTO3.getCountry());
		System.out.println(Arrays.toString(playerDTO3.getSports()));
		System.out.println(Arrays.toString(playerDTO3.getAwards()));
		System.out.println(" ");

		PlayerDTO playerDTO4 = new PlayerDTO();
		playerDTO4.setName("Sachin Tendulkar");
		playerDTO4.setCountry("India");
		playerDTO4.setSports(new String[] { "Cricket" });
		playerDTO4.setAwards(new String[] { "Rajiv Gandhi Khel Ratna", " Padma Shri " });

		System.out.println(playerDTO4.getName());
		System.out.println(playerDTO4.getCountry());
		System.out.println(Arrays.toString(playerDTO4.getSports()));
		System.out.println(Arrays.toString(playerDTO4.getAwards()));
		System.out.println(" ");

		PlayerDTO playerDTO5 = new PlayerDTO();
		playerDTO5.setName("Cristiano Ronaldo");
		playerDTO5.setCountry("Portuguese");
		playerDTO5.setSports(new String[] { "Football" });
		playerDTO5.setAwards(new String[] { " Ballon d'Or", "UEFA European Championship", " FIFA Club World Cup" });

		System.out.println(playerDTO5.getName());
		System.out.println(playerDTO5.getCountry());
		System.out.println(Arrays.toString(playerDTO5.getSports()));
		System.out.println(Arrays.toString(playerDTO5.getAwards()));
	
			
			

	}

}
