package mapper;

import models.Medecin;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MedecinRowMapper implements RowMapper<Medecin> {
    @Override
    public Medecin mapRow(ResultSet rs, int i) throws SQLException {
        Medecin medecin = new Medecin();
        medecin.setCode_inami(rs.getInt("code_inami"));
        medecin.setNom(rs.getString("nom"));
        medecin.setAddresse(rs.getString("adresse"));
        medecin.setEmail(rs.getString("email"));
        medecin.setMot_de_passe(rs.getString("mot_de_passe"));
        return medecin;
    }
}
