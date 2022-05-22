package com.spsgame.ENTITY;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="spsgame")
public class PlayerEntity {
	
	@Id
	public String choice;

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	

}
