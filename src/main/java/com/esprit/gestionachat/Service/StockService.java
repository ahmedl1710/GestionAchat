package com.esprit.gestionachat.Service;

import com.esprit.gestionachat.Entity.Stock;

import java.util.List;

public interface StockService {


    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);
}
