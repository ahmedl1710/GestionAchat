package com.esprit.gestionachat.Service;


import com.esprit.gestionachat.Entity.SecteurActivite;
import com.esprit.gestionachat.Repository.SecteurActiviteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SecteurActiviteServiceImpl implements SecteurActiviteService{

        private SecteurActiviteRepository secRepo;


    public List<SecteurActivite> retrieveAllSecteurActivites() {
        return secRepo.findAll();
    }


    public SecteurActivite addSecteurActivite(SecteurActivite sa) {
        return secRepo.save(sa);
    }


    public SecteurActivite updateSecteurActivite(SecteurActivite sa) {
        return secRepo.save(sa);
    }


    public SecteurActivite retrieveSecteurActivite(Long id) {
        return secRepo.findById(id).get();
    }


    public void removeSecteurActivite(Long id) {
        secRepo.deleteById(id);
    }
}
