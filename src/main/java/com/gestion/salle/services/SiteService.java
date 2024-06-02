//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.services;

import com.gestion.salle.entities.Site;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface SiteService {
    List<Site> getAllSites();

    Site saveSite(Site site);

    Site findSiteById(Long site);

    Site getSiteById(long l);
}
