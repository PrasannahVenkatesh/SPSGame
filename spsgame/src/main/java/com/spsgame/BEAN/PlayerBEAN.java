package com.spsgame.BEAN;

import javax.validation.constraints.NotEmpty;

public class PlayerBEAN {
	
	public String choice;
	@NotEmpty(message = "Required")
	public String playerName;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	
	

}
