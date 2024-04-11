package dao.medecin;

import models.Medecin;

import java.util.List;

public interface MedecinDAO {
    List<Medecin> findAll();
    void insertMedecin(Medecin medecin);
    void updateMedecin(Medecin medecin);
    void executeUpdateMedecin(Medecin medecin);
    public void deleteMedecin(Medecin medecin);


}
