//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.controllers;

import com.gestion.salle.entities.Reservation;
import com.gestion.salle.entities.Room;
import com.gestion.salle.services.ReservationService;
import com.gestion.salle.services.RoomService;
import com.gestion.salle.services.SiteService;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoomController {
    @Autowired
    RoomService roomService;
    @Autowired
    SiteService siteService;
    @Autowired
    ReservationService reservationService;

    public RoomController() {
    }

    @RequestMapping({"/"})
    public String roomsList(ModelMap modelMap) {
        List<Room> roomsController = this.roomService.getAllRooms();
        modelMap.addAttribute("roomsJsp", roomsController);
        return "roomsList";
    }

    @RequestMapping({"/reservation"})
    public String reservation(@RequestParam("id") Long id, @ModelAttribute("jour") Date jour, ModelMap modelMap) {
        Room roomController = this.roomService.getRoomById(id);
        List<String> equipments = roomController.getEquipment();
        List<String> normalizedEquipments = (List)equipments.stream().map((equipment) -> {
            return equipment.toLowerCase().trim();
        }).collect(Collectors.toList());
        boolean noBookingRoom = normalizedEquipments.isEmpty() && (double)roomController.getCapacity() * 0.7 < 3.0;
        boolean hasVcEquipment = normalizedEquipments.contains("ecran") && normalizedEquipments.contains("pieuvre") && normalizedEquipments.contains("webcam");
        boolean hasSpecEquipment = normalizedEquipments.contains("tableau");
        boolean hasRcEquipment = normalizedEquipments.contains("ecran") && normalizedEquipments.contains("pieuvre") && normalizedEquipments.contains("tableau");
        modelMap.addAttribute("roomJsp", roomController);
        modelMap.addAttribute("noBookingRoom", noBookingRoom);
        modelMap.addAttribute("hasVcEquipment", hasVcEquipment);
        modelMap.addAttribute("hasSpecEquipment", hasSpecEquipment);
        modelMap.addAttribute("hasRcEquipment", hasRcEquipment);
        List<Reservation> reservations = this.reservationService.getReservationsByRoomId(id);
        modelMap.addAttribute("reservations", reservations);
        return "reservation";
    }

    @PostMapping({"/saveReservation"})
    public String saveReservation(@ModelAttribute("roomId") Long roomId, @ModelAttribute("typeMeet") String typeMeeting, @ModelAttribute("jour") LocalDate dateReservation, @ModelAttribute("heure") String heureReservation, @ModelAttribute("capacity") int capacityReservation) {
        Room room = this.roomService.getRoomById(roomId);
        Reservation reservation = new Reservation();
        reservation.setReservationRoom(room);
        reservation.setTypeMeeting(typeMeeting);
        reservation.setDateReservation(dateReservation);
        reservation.setHeureReservation(heureReservation);
        reservation.setReservationCapacity(capacityReservation);
        this.reservationService.saveReservation(reservation);
        return "redirect:/";
    }
}
