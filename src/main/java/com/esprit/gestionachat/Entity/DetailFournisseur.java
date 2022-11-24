package com.esprit.gestionachat.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

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
public class DetailFournisseur implements Serializable {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long idDetailFournisseur;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;
    private String adresse;
    private String matricule;

    @ManyToOne(cascade= CascadeType.ALL)
    private Facture facture;

    @OneToOne(mappedBy = "detailFournisseur",cascade= CascadeType.ALL)
    private Fournisseur fournisseur;

    @ManyToOne
    private Produit produit;

}
