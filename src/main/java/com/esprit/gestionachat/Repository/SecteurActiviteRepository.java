package com.esprit.gestionachat.Repository;

import com.esprit.gestionachat.Entity.SecteurActivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SecteurActiviteRepository extends JpaRepository<SecteurActivite,Long> {
}
