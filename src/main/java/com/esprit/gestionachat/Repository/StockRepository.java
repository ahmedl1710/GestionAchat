package com.esprit.gestionachat.Repository;

import com.esprit.gestionachat.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {
}
