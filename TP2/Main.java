package TP2;

public class Main {
    public static void main(String[] args) {
        DossierPharmacie dossier = new DossierPharmacie("Pharmacie de nuit ");

        dossier.nouveauPatient("dorra", new String[]{"analgan", "inflamyl"});
        dossier.nouveauPatient("yessmin", new String[]{"ecorex", "Vitamine C"});
        dossier.nouveauPatient("leila", new String[]{"panadol", "inflamyl"});
        dossier.affiche();
        dossier.ajoutMedicament("yessmin", "inflamyl");
        System.out.println("******************************");
        dossier.affichePatient("yessmin");
        System.out.println("Patients avec de la inflamyl dans leur ordonnance :");
        for (String nom : dossier.affichePatientAvecMedicament("inflamyl")) {
            System.out.println("- " + nom);
        };


    }
}
