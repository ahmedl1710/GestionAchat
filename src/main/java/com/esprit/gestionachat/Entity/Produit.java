package com.esprit.gestionachat.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produit implements Serializable {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "produit")
    private Set<DetailFacture> detailFactures;

    @ManyToOne(cascade= CascadeType.ALL)
    private Stock stock;

    @ManyToOne(cascade= CascadeType.ALL)
    private CategorieProduit categorieProduits;
}
