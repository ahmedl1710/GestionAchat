package com.esprit.gestionachat.Service;

import com.esprit.gestionachat.Entity.Operateur;

import java.util.List;

public interface OperateurService {
    List<Operateur> retrieveAllOperateurs();

    Operateur addOperateur (Operateur o);

    Operateur updateOperateur (Operateur o);

    Operateur retrieveOperateur (Long id);

    void removeOperateur (Long id);

}
