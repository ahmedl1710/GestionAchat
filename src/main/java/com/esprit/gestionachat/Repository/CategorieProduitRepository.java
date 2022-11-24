package com.esprit.gestionachat.Repository;


import com.esprit.gestionachat.Entity.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProduitRepository extends JpaRepository<CategorieProduit,Long> {
}
