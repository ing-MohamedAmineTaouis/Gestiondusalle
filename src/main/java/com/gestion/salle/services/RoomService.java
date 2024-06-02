//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.services;

import com.gestion.salle.entities.Room;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface RoomService {
    List<Room> getAllRooms();

    Room getRoomById(Long id);

    Room saveRoom(Room room);
}
