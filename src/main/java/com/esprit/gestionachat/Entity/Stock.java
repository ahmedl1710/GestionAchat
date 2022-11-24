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
public class Stock implements Serializable {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long idStock;
    private int qte;
    private int qteMin;
    private String libelleStock;

    @OneToMany(cascade= CascadeType.ALL,mappedBy = "stock")
    private Set<Produit> produits;

}
