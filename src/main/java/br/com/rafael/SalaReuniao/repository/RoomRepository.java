package br.com.rafael.SalaReuniao.repository;

import br.com.rafael.SalaReuniao.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
