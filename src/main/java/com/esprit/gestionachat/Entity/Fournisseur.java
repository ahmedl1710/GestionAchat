package com.esprit.gestionachat.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Getter
 @Setter
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Fournisseur implements Serializable {


    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;

    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<SecteurActivite> secteurs;

    @OneToOne(cascade= CascadeType.ALL)
    private DetailFournisseur detailFournisseur;

}
