package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Mirmillon Bob = new Mirmillon("Bob le malchanceux", 15, 15, 70, 15);
    Personnage Igor = new Personnage("Igor l'empaleur", 25, 5, 100, 30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    // TODO : Afficher les infos de chaque personnage
    // TODO : Afficher le message du début du combat
    affichage.afficherSeparateurInfosPerso();
    Bob.setNewInitiativeRandomMirmillon();
    Bob.InfosPersonnageMirnillon();
    Igor.setNewInitiativeRandom();
    Igor.afficherInfosPersonnage();
     affichage.afficherSeparateurDeTour();
    affichage.afficherDebutCombat();
    
        
   
        do {
            
            tour.afficheTour();
            
            for (int i = 0; i < 100; i++) {
            if (Bob.initiative == i) {
                Bob.frapperPersonnageMirmillon(Igor);
            }
            if (Igor.initiative == i) {
                Igor.frapperPersonnage(Bob);
            }
        }
            
            affichage.afficherSeparateurInfosPerso();
            
            Bob.InfosPersonnageMirnillon();
            Igor.afficherInfosPersonnage();
            Bob.setNewInitiativeRandomMirmillon();
            Igor.setNewInitiativeRandom();
            tour.augmenteTour();
            
            affichage.afficherSeparateurDeTour();
            
            
        } while (Bob.pointsDeVie != 0 && Igor.pointsDeVie !=0);
    
        affichage.afficheVictoire(Bob, Igor);
    
    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
