package com.formation.serviceroom.dto.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class RoomSimpleRequestDto {

	@NotNull
	@Length(min = 8)
	private String description;

	public RoomSimpleRequestDto(@Length(min = 8) String description) {
		super();
		this.description = description;
	}

	public RoomSimpleRequestDto() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
