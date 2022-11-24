package com.esprit.gestionachat.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SecteurActivite implements Serializable {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "secteurs")
    private Set<Fournisseur> fournisseurs;
}
