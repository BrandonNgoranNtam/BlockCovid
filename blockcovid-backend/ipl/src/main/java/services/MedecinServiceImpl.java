package services;

import dao.medecin.MedecinDAO;
import models.Medecin;

import javax.annotation.Resource;
import java.util.List;

public class MedecinServiceImpl implements MedecinService{

    @Resource
    private MedecinDAO medecinDAO;

    @Override
    public List<Medecin> findAll() {
        return medecinDAO.findAll();
    }

    @Override
    public void insertMedecin(Medecin medecin) {
        medecinDAO.insertMedecin(medecin);
    }

    @Override
    public void updateMedecin(Medecin medecin) {
        medecinDAO.updateMedecin(medecin);
    }

    @Override
    public void executeUpdateMedecin(Medecin medecin) {
        medecinDAO.executeUpdateMedecin(medecin);
    }

    @Override
    public void deleteMedecin(Medecin medecin) {
        medecinDAO.deleteMedecin(medecin);
    }
}
