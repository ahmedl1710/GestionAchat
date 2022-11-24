package com.esprit.gestionachat.Service;

import com.esprit.gestionachat.Entity.CategorieProduit;
import com.esprit.gestionachat.Entity.Produit;
import com.esprit.gestionachat.Entity.Stock;
import com.esprit.gestionachat.Repository.CategorieProduitRepository;
import com.esprit.gestionachat.Repository.ProduitRepository;
import com.esprit.gestionachat.Repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService{

    private ProduitRepository produitRepo;
    private StockRepository stockRepo;
    private CategorieProduitRepository catProdRepo;



    public List<Produit> retrieveAllProduits() {
        return produitRepo.findAll();
    }


    public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {

         Stock stockk= stockRepo.findById(idStock).get();
         CategorieProduit cat= catProdRepo.findById(idCategorieProduit).get();
         p.setStock(stockk);
         p.setCategorieProduits(cat);
        return produitRepo.save(p);
    }


    public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {
        Stock stockk= stockRepo.findById(idStock).get();
        CategorieProduit cat= catProdRepo.findById(idCategorieProduit).get();
        p.setStock(stockk);
        p.setCategorieProduits(cat);
        return produitRepo.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepo.findById(id).get();
    }
}
