package com.esprit.gestionachat.Service;


import com.esprit.gestionachat.Entity.CategorieProduit;
import com.esprit.gestionachat.Repository.CategorieProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategorieProduitImpl implements CategorieProduitService{


    private CategorieProduitRepository catProdRepo;



    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return catProdRepo.findAll();
    }


    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return catProdRepo.save(cp);
    }


    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        return catProdRepo.save(cp);
    }


    public CategorieProduit retrieveCategorieProduit(Long id) {
        return catProdRepo.findById(id).get();
    }


    public void removeCategorieProduit(Long id) {
        catProdRepo.deleteById(id);
    }
}
