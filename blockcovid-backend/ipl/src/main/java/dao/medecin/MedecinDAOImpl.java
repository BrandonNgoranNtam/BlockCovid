package dao.medecin;
import java.util.List;

import mapper.MedecinRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import models.Medecin;

@Repository
public class MedecinDAOImpl implements MedecinDAO {

    public MedecinDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    NamedParameterJdbcTemplate template;

    @Override
    public List<Medecin> findAll() {
        return template.query("select * from projet.medecin", new MedecinRowMapper());
    }

    @Override
    public void insertMedecin(Medecin medecin) {

    }

    @Override
    public void updateMedecin(Medecin medecin) {

    }

    @Override
    public void executeUpdateMedecin(Medecin medecin) {

    }

    @Override
    public void deleteMedecin(Medecin medecin) {

    }
}
