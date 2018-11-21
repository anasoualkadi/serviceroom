package com.formation.serviceroom.dto.response;

import javax.validation.constraints.NotNull;

public class RoomResponseDto {
	@NotNull
	private int nbRoom;
	
	@NotNull
	private String description;
	
	@NotNull
	private int prix;

	public RoomResponseDto(@NotNull int nbRoom, @NotNull String description, @NotNull int prix) {
		super();
		this.nbRoom = nbRoom;
		this.description = description;
		this.prix = prix;
	}

	public RoomResponseDto() {
	}

	public int getNbRoom() {
		return nbRoom;
	}

	public void setNbRoom(int nbRoom) {
		this.nbRoom = nbRoom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
}
