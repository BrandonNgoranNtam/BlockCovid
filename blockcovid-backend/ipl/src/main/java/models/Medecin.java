package models;

public class Medecin {
    private int code_inami;
    private String nom;
    private String addresse;
    private String email;
    private String mot_de_passe;


    public int getCode_inami() {
        return code_inami;
    }

    public void setCode_inami(int code_inami) {
        this.code_inami = code_inami;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }
}
