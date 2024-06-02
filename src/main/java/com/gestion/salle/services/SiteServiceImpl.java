//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gestion.salle.services;

import com.gestion.salle.entities.Site;
import com.gestion.salle.repositories.SiteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    SiteRepository siteRepository;

    public SiteServiceImpl() {
    }

    public List<Site> getAllSites() {
        return this.siteRepository.findAll();
    }

    public Site saveSite(Site site) {
        return (Site)this.siteRepository.save(site);
    }

    public Site findSiteById(Long id) {
        return (Site)this.siteRepository.findById(id).get();
    }

    public Site getSiteById(long l) {
        return (Site)this.siteRepository.findById(l).get();
    }
}
