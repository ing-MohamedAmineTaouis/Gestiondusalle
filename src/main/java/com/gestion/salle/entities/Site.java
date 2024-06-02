//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Site {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long idSite;
    private String nomSite;
    @OneToMany(
            mappedBy = "site"
    )
    private List<Room> rooms;

    public Site() {
    }

    public Site(Long idSite, String nomSite, List<Room> rooms) {
        this.idSite = idSite;
        this.nomSite = nomSite;
        this.rooms = rooms;
    }

    public String toString() {
        Long var10000 = this.idSite;
        return "Site{idSite=" + var10000 + ", nomSite='" + this.nomSite + "', rooms=" + String.valueOf(this.rooms) + "}";
    }

    public Long getIdSite() {
        return this.idSite;
    }

    public void setIdSite(Long idSite) {
        this.idSite = idSite;
    }

    public String getNomSite() {
        return this.nomSite;
    }

    public void setNomSite(String nomSite) {
        this.nomSite = nomSite;
    }

    public List<Room> getRooms() {
        return this.rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
