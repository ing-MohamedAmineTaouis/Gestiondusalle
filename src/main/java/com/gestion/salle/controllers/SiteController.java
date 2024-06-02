//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.controllers;

import com.gestion.salle.services.RoomService;
import com.gestion.salle.services.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SiteController {
    @Autowired
    RoomService roomService;
    @Autowired
    SiteService siteService;

    public SiteController() {
    }
}
