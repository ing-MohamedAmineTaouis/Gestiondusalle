//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.services;

import com.gestion.salle.entities.Reservation;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ReservationService {
    Reservation saveReservation(Reservation reservation);

    List<Reservation> getReservationsByRoomId(Long id);
}
