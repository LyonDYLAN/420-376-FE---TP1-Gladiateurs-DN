package personnages;
import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    public String nom;
    public int pointsDeVie;
    public int valeurMaxAttaque;
    public int valeurDefense;
    public int initiative;
    
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nom = nom;
        valeurMaxAttaque = attaqueMax;
        valeurDefense = defense;
        pointsDeVie = pvs;
        initiative = ini;
    }

    public Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        this.nom = "";
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        pointsDeVie = 0;
        initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    // TODO : Les setters
    
        public String getNom() {
        return nom;
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
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
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        String Statut;
        
        if (pointsDeVie <= 0) {
            Statut = "Mort";
        }
        else{
            Statut = "Vivant";
        }
        
                System.out.println("\n " + nom + "\n Attaque : " + valeurMaxAttaque + "\nDéfense : " + valeurDefense + "\nPoints de vie : " + pointsDeVie + "\nInitiative : " + initiative + "\n Statut : " + Statut + "\n");

    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        Random rand= new Random();
        int nombreAleatoire = rand.nextInt((valeurMaxAttaque + 1 ) - 0) + 0;
        
        
        return nombreAleatoire;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
        int dommages;
        int forceDeFrappe = attaqueCalcul();
        
        attaqueCalcul();
        
        dommages = forceDeFrappe - personnageCible.valeurDefense;
        
        if (dommages <=0) {
            dommages = 0;
        }
     
        personnageCible.pointsDeVie -= dommages;
        
        if (personnageCible.pointsDeVie <=0) {
            
            personnageCible.pointsDeVie = 0;
        }
        
        System.out.println("\n" + nom + " attaque avec une puissance de : " + forceDeFrappe);
        System.out.println(personnageCible.nom + " a une defense de : " + personnageCible.valeurDefense);
        System.out.println(" Les dommages sont donc de : " + dommages);
        
        
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        
        Random rand= new Random();
        int nombreAleatoire = rand.nextInt((100 + 1 ) - 0) + 0;
        
        initiative = nombreAleatoire;
    }
    // </editor-fold>
}
