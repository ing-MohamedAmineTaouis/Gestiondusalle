//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long idReservation;
    @ManyToOne
    private Room reservationRoom;
    private int reservationCapacity;
    private String typeMeeting;
    private LocalDate dateReservation;
    private String heureReservation;

    public Reservation() {
    }

    public Reservation(Long idReservation, Room reservationRoom, int reservationCapacity, String typeMeeting, LocalDate dateReservation, String heureReservation) {
        this.idReservation = idReservation;
        this.reservationRoom = reservationRoom;
        this.reservationCapacity = reservationCapacity;
        this.typeMeeting = typeMeeting;
        this.dateReservation = dateReservation;
        this.heureReservation = heureReservation;
    }

    public String toString() {
        Long var10000 = this.idReservation;
        return "Reservation{idReservation=" + var10000 + ", reservationRoom=" + String.valueOf(this.reservationRoom) + ", reservationCapacity=" + this.reservationCapacity + ", typeMeeting='" + this.typeMeeting + "', dateReservation=" + String.valueOf(this.dateReservation) + ", heureReservation='" + this.heureReservation + "'}";
    }

    public Long getIdReservation() {
        return this.idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Room getReservationRoom() {
        return this.reservationRoom;
    }

    public void setReservationRoom(Room reservationRoom) {
        this.reservationRoom = reservationRoom;
    }

    public int getReservationCapacity() {
        return this.reservationCapacity;
    }

    public void setReservationCapacity(int reservationCapacity) {
        this.reservationCapacity = reservationCapacity;
    }

    public String getTypeMeeting() {
        return this.typeMeeting;
    }

    public void setTypeMeeting(String typeMeeting) {
        this.typeMeeting = typeMeeting;
    }

    public LocalDate getDateReservation() {
        return this.dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getHeureReservation() {
        return this.heureReservation;
    }

    public void setHeureReservation(String heureReservation) {
        this.heureReservation = heureReservation;
    }
}
