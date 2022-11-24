package com.esprit.gestionachat.Service;

import com.esprit.gestionachat.Entity.Stock;
import com.esprit.gestionachat.Repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StockServiceImpl implements StockService {


        private StockRepository stockRepo;


    public List<Stock> retrieveAllStocks() {
        return stockRepo.findAll();
    }


    public Stock addStock(Stock s) {
        return stockRepo.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepo.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepo.findById(id).get();
    }

    @Override
    public void removeStock(Long id) {
        stockRepo.deleteById(id);

    }
}
