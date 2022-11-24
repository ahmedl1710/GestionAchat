package com.esprit.gestionachat.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailFacture implements Serializable {


    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long idDetailFacture;
    private int qteCommande;
    private float prixTotalDetail;
    private int pourcentageRemise;
    private float montantRemise;

    @ManyToOne(cascade = CascadeType.ALL)
    private Facture facture;
    @ManyToOne(cascade = CascadeType.ALL)
    private Produit produit;
}
