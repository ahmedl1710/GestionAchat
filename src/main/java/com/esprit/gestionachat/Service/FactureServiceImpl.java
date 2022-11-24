package com.esprit.gestionachat.Service;


import com.esprit.gestionachat.Entity.Facture;
import com.esprit.gestionachat.Repository.FactureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor


public class FactureServiceImpl implements FactureService {

    private FactureRepository factRepo;


    public List<Facture> retrieveAllFactures() {
        return factRepo.findAll();
    }


    public void cancelFacture(Long id) {
        Facture fact=factRepo.findById(id).get();
        fact.setArchive(true);


    }


    public Facture retrieveFacture(Long id) {
        return factRepo.findById(id).get();
    }
}
