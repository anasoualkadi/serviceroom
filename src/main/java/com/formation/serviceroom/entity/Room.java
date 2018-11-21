package com.formation.serviceroom.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Room {

	@ApiModelProperty(notes="id de chambre")
	@Id
	@GeneratedValue
	private UUID id;

	@ApiModelProperty(notes="nombre de chambre")
	private int nbRoom;
	
	private String description;
	
	@ApiModelProperty(notes="prix de chambre")
	private int prix;

	public Room() {
		super();
	}

	public Room(UUID id, int nbRoom, String description, int prix) {
		super();
		this.id = id;
		this.nbRoom = nbRoom;
		this.description = description;
		this.prix = prix;
	}

	public Room(int nbRoom, String description, int prix) {
		this.nbRoom = nbRoom;
		this.description = description;
		this.prix = prix;	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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
