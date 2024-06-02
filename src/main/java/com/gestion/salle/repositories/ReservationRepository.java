//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.repositories;

import com.gestion.salle.entities.Reservation;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByReservationRoom_IdRoom(Long id);

    List<Reservation> findAllByReservationRoom_IdRoomAndDateReservation(Long roomId, LocalDate date);
}
