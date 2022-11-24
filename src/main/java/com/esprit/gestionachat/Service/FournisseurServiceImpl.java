package com.esprit.gestionachat.Service;

import com.esprit.gestionachat.Entity.Fournisseur;
import com.esprit.gestionachat.Repository.FournisseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class FournisseurServiceImpl implements FournisseurService{

    private FournisseurRepository fourserRepo;


    public List<Fournisseur> retrieveAllFournisseurs() {
        return fourserRepo.findAll();
    }


    public Fournisseur addFournisseur(Fournisseur f) {
        return fourserRepo.save(f);
    }


    public Fournisseur updateFournisseur(Fournisseur f) {
        return fourserRepo.save(f);
    }


    public Fournisseur retrieveFournisseur(Long id) {
        return fourserRepo.findById(id).get();
    }
}
