package com.esprit.gestionachat.Service;

import com.esprit.gestionachat.Entity.Produit;

import java.util.List;

public interface ProduitService {

    List<Produit> retrieveAllProduits();

    Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit updateProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit retrieveProduit(Long id);
}
