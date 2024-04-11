package services;

import models.Medecin;

import java.util.List;

public interface MedecinService {
    List<Medecin> findAll();
    void insertMedecin(Medecin medecin);
    void updateMedecin(Medecin medecin);
    void executeUpdateMedecin(Medecin medecin);
    void deleteMedecin(Medecin medecin);
}
