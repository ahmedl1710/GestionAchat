package com.esprit.gestionachat.Service;


import com.esprit.gestionachat.Entity.Fournisseur;

import java.util.List;

public interface FournisseurService {

    List<Fournisseur> retrieveAllFournisseurs();
    Fournisseur addFournisseur (Fournisseur f);
    Fournisseur updateFournisseur (Fournisseur f);
    Fournisseur retrieveFournisseur (Long id);
}
