package TP2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DossierPharmacie  {
    private String nom ;
    private HashMap <String , Patient > patients ;
    public DossierPharmacie ( String n){
        nom =n;
        patients = new HashMap <String , Patient >();
    }
    void nouveauPatient(String nom, String[] ord) {
        Patient p = new Patient(nom);
        for (String medicament : ord) {
            p.ajoutMedicament(medicament);
        }
        patients.put(nom.toLowerCase(), p);
    }

    public boolean ajoutMedicament(String nom, String m) {
        // Convert the provided name to lowercase for case-insensitive search
        String lowercaseNom = nom.toLowerCase();
        Patient p = patients.get(lowercaseNom);
        if (p != null) {
            p.ajoutMedicament(m);
            return true;
        } else {
            System.out.println("Le patient " + nom + " n'existe pas.");
            return false;
        }
    }


    public void affichePatient(String nom) {
        // Convert the provided name to lowercase for case-insensitive search
        String lowercaseNom = nom.toLowerCase();
        Patient p = patients.get(lowercaseNom);
        if (p != null) {
            p.affiche();
        } else {
            System.out.println("Le patient " + nom + " n'existe pas.");
        }
    }
    public void affiche() {
        System.out.println("Nom de la pharmacie : " + nom);
        System.out.println("Liste des patients :");
        for (Patient p : patients.values()) {
            p.affiche();
            System.out.println();
        }
    }
    public Collection<String> affichePatientAvecMedicament(String m) {
        Collection<String> patientsAvecMedicament = new ArrayList<>();

        for (Patient p : patients.values()) {
            if (p.contientMedicament(m)) {
                patientsAvecMedicament.add(p.getNom());
            }
        }
        return patientsAvecMedicament;
    }
}
