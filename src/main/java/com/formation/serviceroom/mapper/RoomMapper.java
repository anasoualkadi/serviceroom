package com.formation.serviceroom.mapper;


import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

import com.formation.serviceroom.dto.request.RoomRequestDto;
import com.formation.serviceroom.dto.request.RoomSimpleRequestDto;
import com.formation.serviceroom.dto.response.RoomResponseDto;
import com.formation.serviceroom.dto.response.RoomSimpleResponseDto;
import com.formation.serviceroom.entity.Room;

@Component
public class RoomMapper {

	public Room asRoomSimpleDtoToEntity(RoomSimpleRequestDto roomSimpleDto) {
		Room roomEntity = new Room();
		roomEntity.setDescription(roomSimpleDto.getDescription());
		return roomEntity;
	}

	public RoomSimpleResponseDto asRoomSimpleToDto(Room roomEntity) {
		RoomSimpleResponseDto roomResponseDto = new RoomSimpleResponseDto();
		roomResponseDto.setDescription(roomEntity.getDescription());
		return roomResponseDto;
	}
	

	public Room asRoomDtoToEntity(RoomRequestDto roomDto) {
		Room roomEntity = new Room();
		roomEntity.setDescription(roomDto.getDescription());
		roomEntity.setNbRoom(roomDto.getNbRoom());
		roomEntity.setPrix(roomDto.getPrix());
		return roomEntity;
	}

	public RoomResponseDto asRoomDto(Room roomEntity) {
		RoomResponseDto roomDto = new RoomResponseDto();
		roomDto.setDescription(roomEntity.getDescription());
		roomDto.setNbRoom(roomEntity.getNbRoom());
		roomDto.setPrix(roomEntity.getPrix());
		return roomDto;
	}
	
	public Collection<RoomResponseDto> asListRoomEntityToListEntity(Collection<Room> collectionRoom) {
	return null;
	}


}
