package com.esprit.gestionachat.Service;


import com.esprit.gestionachat.Entity.Facture;

import java.util.List;

public interface FactureService {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
}
