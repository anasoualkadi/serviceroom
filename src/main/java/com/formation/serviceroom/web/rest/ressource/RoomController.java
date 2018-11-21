package com.formation.serviceroom.web.rest.ressource;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.serviceroom.dto.request.RoomRequestDto;
import com.formation.serviceroom.dto.request.RoomSimpleRequestDto;
import com.formation.serviceroom.exception.ResourceNotFoundException;
import com.formation.serviceroom.service.RoomService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="controller des rooms")
@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
	RoomService roomService;

	@ApiOperation(value="Permet de sauver une room")
	@PostMapping("/save")
	public ResponseEntity<?> saveRoom(@Valid @RequestBody RoomRequestDto rrd) {
		return ResponseEntity.ok(roomService.saveRoom(rrd));
	}

	@PutMapping("/updateDescription/{id}")
	public ResponseEntity<?> listRoom(@PathVariable("id") UUID id, @Valid @RequestBody RoomSimpleRequestDto rrd) throws ResourceNotFoundException {
		return ResponseEntity.ok(roomService.updateRoom(id, rrd));
	}

	@GetMapping("/deletebyid")
	public void deleteRoom() {
		roomService.deleteRoom();

	}

}