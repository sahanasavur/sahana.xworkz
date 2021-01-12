package com.xwork.cricket;

import com.xwork.cricket.event.PlayerService;
import com.xwork.cricket.playerDTO.PlayerDTO;

public class ExceptionTester {

	public static void main(String[] args) {

		PlayerService playerService = new PlayerService();

		PlayerDTO dto = new PlayerDTO();

		playerService.showDetails(dto);
	}
}
