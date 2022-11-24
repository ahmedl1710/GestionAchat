package com.esprit.gestionachat.Repository;

import com.esprit.gestionachat.Entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
