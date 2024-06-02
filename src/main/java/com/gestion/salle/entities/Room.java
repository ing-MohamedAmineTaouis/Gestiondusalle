//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Room {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long idRoom;
    private String nomRoom;
    private int capacity;
    @ElementCollection
    private List<String> equipment;
    @ManyToOne
    private Site site;
    @OneToMany(
            mappedBy = "reservationRoom"
    )
    private List<Reservation> reservations;

    public Room() {
    }

    public Room(Long idRoom, String nomRoom, int capacity, List<String> equipment, Site site) {
        this.idRoom = idRoom;
        this.nomRoom = nomRoom;
        this.capacity = capacity;
        this.equipment = equipment;
        this.site = site;
    }

    public String toString() {
        Long var10000 = this.idRoom;
        return "Room{idRoom=" + var10000 + ", nomRoom='" + this.nomRoom + "', capacity=" + this.capacity + ", equipment=" + String.valueOf(this.equipment) + ", site=" + String.valueOf(this.site) + "}";
    }

    public Long getIdRoom() {
        return this.idRoom;
    }

    public void setIdRoom(Long idRoom) {
        this.idRoom = idRoom;
    }

    public String getNomRoom() {
        return this.nomRoom;
    }

    public void setNomRoom(String nomRoom) {
        this.nomRoom = nomRoom;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getEquipment() {
        return this.equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public Site getSite() {
        return this.site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public List<Reservation> getReservations() {
        return this.reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getEquipmentAsString() {
        return this.equipment != null && !this.equipment.isEmpty() ? (String)this.equipment.stream().collect(Collectors.joining(", ")) : "No equipment";
    }

    public void addNewReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
}
