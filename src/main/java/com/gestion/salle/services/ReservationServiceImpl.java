//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.services;

import com.gestion.salle.entities.Reservation;
import com.gestion.salle.repositories.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public ReservationServiceImpl() {
    }

    public Reservation saveReservation(Reservation reservation) {
        return (Reservation)this.reservationRepository.save(reservation);
    }

    public List<Reservation> getReservationsByRoomId(Long id) {
        return this.reservationRepository.findAllByReservationRoom_IdRoom(id);
    }
}
