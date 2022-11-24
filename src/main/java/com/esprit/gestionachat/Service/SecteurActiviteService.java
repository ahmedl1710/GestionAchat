package com.esprit.gestionachat.Service;

import com.esprit.gestionachat.Entity.SecteurActivite;

import java.util.List;

public interface SecteurActiviteService {

    List<SecteurActivite> retrieveAllSecteurActivites();

    SecteurActivite addSecteurActivite (SecteurActivite sa);

    SecteurActivite updateSecteurActivite (SecteurActivite sa);

    SecteurActivite retrieveSecteurActivite (Long id);

    void removeSecteurActivite (Long id);
}
