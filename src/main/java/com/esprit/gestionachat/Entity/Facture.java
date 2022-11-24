package com.esprit.gestionachat.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;


@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facture implements Serializable {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    private boolean archive;
    @OneToMany(mappedBy = "factures")
    private Collection<Reglement> reglement;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Operateur> operateurs;

    @ManyToOne(cascade = CascadeType.ALL)
    private Fournisseur fournisseur;


    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;






    public Collection<Reglement> getReglement() {
        return reglement;
    }

    public void setReglement(Collection<Reglement> reglement) {
        this.reglement = reglement;
    }
}
