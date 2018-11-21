package com.formation.serviceroom.dto.response;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class RoomSimpleResponseDto {

	@NotNull
	@Length(min = 8)
	private String description;

	public RoomSimpleResponseDto(@Length(min = 8) String description) {
		super();
		this.description = description;
	}

	public RoomSimpleResponseDto() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
