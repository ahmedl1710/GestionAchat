package com.esprit.gestionachat.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategorieProduit implements Serializable {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long idCategorieProduit;
    private String codeProduit;
    private String libelleCategorie;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "categorieProduits")
    private Set<Produit> produit;



}
