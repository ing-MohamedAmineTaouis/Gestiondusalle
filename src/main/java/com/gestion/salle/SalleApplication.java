//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle;

import com.gestion.salle.entities.Room;
import com.gestion.salle.entities.Site;
import com.gestion.salle.services.RoomService;
import com.gestion.salle.services.SiteService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalleApplication {
	public SalleApplication() {
	}

	public static void main(String[] args) {
		SpringApplication.run(SalleApplication.class, args);
	}

	@Bean
	public CommandLineRunner populateSitesAndRooms(SiteService siteService, RoomService roomService) {
		return (args) -> {
			Site site1x;
			if (siteService.getAllSites().isEmpty()) {
				Site site1 = new Site((Long)null, "Site1", (List)null);
				site1x = new Site((Long)null, "Site2", (List)null);
				Site site3x = new Site((Long)null, "Site3", (List)null);
				siteService.saveSite(site1);
				siteService.saveSite(site1x);
				siteService.saveSite(site3x);
				System.out.println("Sites added successfully.");
			} else {
				System.out.println("Sites table is not empty. Skipping site creation.");
			}

			List<String> equipmentList = new ArrayList();
			if (roomService.getAllRooms().isEmpty()) {
				site1x = siteService.getSiteById(1L);
				equipmentList.clear();
				Room room1 = new Room((Long)null, "E1001", 23, equipmentList, site1x);
				roomService.saveRoom(room1);
				equipmentList.clear();
				equipmentList.add("Ecran");
				Room room2 = new Room((Long)null, "E1002", 10, new ArrayList(equipmentList), site1x);
				roomService.saveRoom(room2);
				equipmentList.clear();
				equipmentList.add("Pieuvre");
				Room room3 = new Room((Long)null, "E1003", 8, new ArrayList(equipmentList), site1x);
				roomService.saveRoom(room3);
				equipmentList.clear();
				equipmentList.add("Tableau");
				Room room4 = new Room((Long)null, "E1004", 4, new ArrayList(equipmentList), site1x);
				roomService.saveRoom(room4);
				Site site2 = siteService.getSiteById(2L);
				equipmentList.clear();
				Room room5 = new Room((Long)null, "E2001", 4, equipmentList, site2);
				roomService.saveRoom(room5);
				equipmentList.clear();
				equipmentList.add("Ecran");
				equipmentList.add("Webcam");
				Room room6 = new Room((Long)null, "E2002", 15, new ArrayList(equipmentList), site2);
				roomService.saveRoom(room6);
				equipmentList.clear();
				Room room7 = new Room((Long)null, "E2003", 7, equipmentList, site2);
				roomService.saveRoom(room7);
				equipmentList.clear();
				equipmentList.add("Tableau");
				Room room8 = new Room((Long)null, "E2004", 9, new ArrayList(equipmentList), site2);
				roomService.saveRoom(room8);
				Site site3 = siteService.getSiteById(3L);
				equipmentList.clear();
				equipmentList.add("Ecran");
				equipmentList.add("Webcam");
				equipmentList.add("Pieuvre");
				Room room9 = new Room((Long)null, "E3001", 13, new ArrayList(equipmentList), site3);
				roomService.saveRoom(room9);
				equipmentList.clear();
				Room room10 = new Room((Long)null, "E3002", 8, equipmentList, site3);
				roomService.saveRoom(room10);
				equipmentList.clear();
				equipmentList.add("Ecran");
				equipmentList.add("Pieuvre");
				Room room11 = new Room((Long)null, "E3003", 9, new ArrayList(equipmentList), site3);
				roomService.saveRoom(room11);
				equipmentList.clear();
				Room room12 = new Room((Long)null, "E3004", 4, equipmentList, site3);
				roomService.saveRoom(room12);
				System.out.println("Rooms added successfully.");
			} else {
				System.out.println("Rooms table is not empty. Skipping room creation.");
			}

		};
	}
}
