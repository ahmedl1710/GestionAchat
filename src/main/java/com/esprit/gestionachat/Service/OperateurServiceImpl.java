package com.esprit.gestionachat.Service;


import com.esprit.gestionachat.Entity.Operateur;
import com.esprit.gestionachat.Repository.OPerateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OperateurServiceImpl implements OperateurService {

    private OPerateurRepository operateurRepo;


    public List<Operateur> retrieveAllOperateurs() {
        return operateurRepo.findAll();
    }


    public Operateur addOperateur(Operateur o) {
        return operateurRepo.save(o);
    }


    public Operateur updateOperateur(Operateur o) {
        return operateurRepo.save(o);
    }


    public Operateur retrieveOperateur(Long id) {
        return operateurRepo.findById(id).get();
    }

    @Override
    public void removeOperateur(Long id) {
        operateurRepo.deleteById(id);
    }
}
