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
public class Operateur implements Serializable {


    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private long idOperateur;
    private String nom;
    private String prenom;
    private String password;


}
