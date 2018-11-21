package com.formation.serviceroom.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.serviceroom.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
	
	public Optional<Room> findById(UUID id);

}