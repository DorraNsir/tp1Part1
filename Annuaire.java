package TP1Part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Annuaire {
    private Map<String, Fiche> annuaire;
    public Annuaire() {
        annuaire = new HashMap<>();
    }
    public void AddFiche(String nom, String numero, String adresse) {
        Fiche fiche = new Fiche(nom, numero, adresse);
        annuaire.put(nom, fiche);
    }
    public Fiche FindFiche(String nom) {
        return annuaire.get(nom);
    }

    public void PrintAllFiches() {
        for (Fiche fiche : annuaire.values()) {
            System.out.println(fiche);
        }
    }
        public static void main(String[] args){
            Annuaire annuaire = new Annuaire();
            Scanner scanner = new Scanner(System.in);
            boolean continuer = true;

            while (continuer) {
                System.out.println("Entrez une commande (+nom, ?nom, !, . ou bye): ");
                String commande = scanner.nextLine();

                switch (commande.charAt(0)) {
                    case '+':
                        String nomAjout = commande.substring(1);
                        System.out.println("Entrez le numéro de téléphone pour " + nomAjout + ": ");
                        String numero = scanner.nextLine();
                        System.out.println("Entrez l'adresse pour " + nomAjout + ": ");
                        String adresse = scanner.nextLine();
                        annuaire.AddFiche(nomAjout, numero, adresse);
                        break;
                    case '?':
                        String nomRecherche = commande.substring(1);
                        System.out.println("fiche trouvée pour : ");
                        Fiche fiche = annuaire.FindFiche(nomRecherche);
                        if (fiche != null) {
                            System.out.println(fiche);
                        } else {
                            System.out.println("Aucune fiche trouvée pour le nom " + nomRecherche);
                        }
                        break;
                    case '!':
                        annuaire.PrintAllFiches();
                        break;
                    case '.':
                        continuer = false;
                        break;
                    default:
                        System.out.println("Commande non reconnue.");
                }
            }
        }

}
