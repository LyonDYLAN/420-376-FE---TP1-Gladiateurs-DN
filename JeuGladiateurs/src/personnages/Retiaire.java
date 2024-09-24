/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

//import java.util.Random;

/**
 *
 * @author 202330464
 */
public class Retiaire extends Personnage{

    String classe = "Retiaire";
    boolean filet = true;
    boolean lance = true; 

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    
    
    
    
// <editor-fold defaultstate="collapsed" desc="getters">
    
public String getClasse() {
        return classe;
    }

    public boolean isFilet() {
        return filet;
    }

    public boolean isLance() {
        return lance;
    }
    // </editor-fold>

    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="setters">
    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setFilet(boolean filet) {
        this.filet = filet;
    }

    public void setLance(boolean lance) {
        this.lance = lance;
    }
        
    // </editor-fold>

    
        
    
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">

    
    public void InfosPersonnageRetiaire() {
       
        afficherInfosPersonnage();
        System.out.println("\nClasse : " + classe);
    }

    

    public void frapperPersonnageRetiaire(Personnage personnageCible) {
            
        int nombreAleatoire = rand.nextInt(101);
        
        if (nombreAleatoire <= 10) {
            
            if (filet == true) {
                personnageCible.pointsDeVie = 0;

                System.out.println("\nSon filet attrape " + personnageCible.nom + " et il l'empale sauvagement avec sa lance ! ");
                System.out.println("\n La defense de " + personnageCible.nom + " est inutile ! \n");
                System.out.println( personnageCible.nom + " est mort sur le coup ! ");
            }
            else if (filet = false){
                filet = true;
                frapperPersonnage(personnageCible);

            }
            
            
        

        }
        else{
            System.out.println("Le filet ne l'a pas toucher ! ");
            filet = false;
            
            
            
        }
    }
    // </editor-fold>

}


    

    
