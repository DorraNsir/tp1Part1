package TP1Part2;

public class Fiche {
    private String nom;
    private String numero;
    private String adresse;

    public Fiche(String nom, String numero, String adresse) {
        this.nom = nom;
        this.numero = numero;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Numéro: " + numero + ", Adresse: " + adresse;
    }
}