package com.formation.serviceroom.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.serviceroom.dto.request.RoomRequestDto;
import com.formation.serviceroom.dto.request.RoomSimpleRequestDto;
import com.formation.serviceroom.dto.response.RoomResponseDto;
import com.formation.serviceroom.entity.Room;
import com.formation.serviceroom.exception.ResourceNotFoundException;
import com.formation.serviceroom.mapper.RoomMapper;
import com.formation.serviceroom.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	RoomRepository roomRepository;
	
	@Autowired 
	RoomMapper roomMapper;

	public RoomResponseDto saveRoom(RoomRequestDto roomRequestDto) {
		Room room = roomMapper.asRoomDtoToEntity(roomRequestDto);
		room = roomRepository.save(room);
		return roomMapper.asRoomDto(room);
	}

	public List<Room> listRoom() {
		return roomRepository.findAll();
	}
	
	public RoomResponseDto updateRoom(UUID id, RoomSimpleRequestDto roomSimpleRequestDto) throws ResourceNotFoundException {
		Room room = roomRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("room inexistante"));
		if (room == null) {
			return null;
		}
		room.setDescription(roomSimpleRequestDto.getDescription());
		return roomMapper.asRoomDto(roomRepository.save(room));
	} 

	public void deleteRoom() {
		List<Room> listRoom = roomRepository.findAll();
		roomRepository.delete(listRoom.get(0));

	}
}
