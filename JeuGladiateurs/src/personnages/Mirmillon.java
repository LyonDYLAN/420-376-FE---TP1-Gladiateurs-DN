/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

/**
 *
 * @author 202330464
 */
public class Mirmillon extends Personnage {

    String classe = " Mirmillon";
    
    
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        
        initiative = 30;
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="getters">
    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="setters">
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    // </editor-fold>

    
    
     // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    
    public void InfosPersonnageMirnillon() {
       
        afficherInfosPersonnage();
        System.out.println("\nClasse : " + classe);
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        Random rand= new Random();
        int nombreAleatoire = rand.nextInt((valeurMaxAttaque + 1 ) - 0) + 0;
        
        
        return nombreAleatoire;
    }

    public void frapperPersonnageMirmillon(Personnage personnageCible) {
        frapperPersonnage(personnageCible);
        if (personnageCible.pointsDeVie <=0) {
            System.out.println("Adversaire décaptié");
            
        }
        else{
            System.out.println("Il frappe une deuxième fois !");
            frapperPersonnage(personnageCible);
        }
        
    }

    public void setNewInitiativeRandomMirmillon() {
        
        Random rand= new Random();
        int nombreAleatoire = rand.nextInt((30 + 1 ) - 0) + 0;
        
        initiative = nombreAleatoire;
    }
    // </editor-fold>
    
}
