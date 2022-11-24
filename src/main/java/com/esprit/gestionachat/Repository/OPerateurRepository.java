package com.esprit.gestionachat.Repository;

import com.esprit.gestionachat.Entity.Operateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OPerateurRepository extends JpaRepository<Operateur,Long> {
}
