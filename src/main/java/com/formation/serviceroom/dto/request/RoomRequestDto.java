package com.formation.serviceroom.dto.request;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

public class RoomRequestDto {

	@NotNull
	private int nbRoom;
	
	@NotNull
	@ApiModelProperty(notes="description de chambre")
	private String description;
	
	@NotNull
	private int prix;

	public RoomRequestDto(@NotNull int nbRoom, @NotNull String description, @NotNull int prix) {
		super();
		this.nbRoom = nbRoom;
		this.description = description;
		this.prix = prix;
	}

	public RoomRequestDto() {
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
