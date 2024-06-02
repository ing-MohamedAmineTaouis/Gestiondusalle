//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.services;

import com.gestion.salle.entities.Room;
import com.gestion.salle.repositories.RoomRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomRepository roomRepository;

    public RoomServiceImpl() {
    }

    public List<Room> getAllRooms() {
        return this.roomRepository.findAll();
    }

    public Room getRoomById(Long id) {
        return (Room)this.roomRepository.findById(id).get();
    }

    public Room saveRoom(Room room) {
        return (Room)this.roomRepository.save(room);
    }
}
