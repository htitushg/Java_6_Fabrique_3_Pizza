import java.util.ArrayList;

public abstract class Pizza {
    String nom;
    Pate pate;
    Sauce sauce;
    Legumes[] legumes;
    Fromage fromage;
    FruitsDeMer fruitsDeMer;
    float prix;

    abstract void preparer();
    void cuire() {

        System.out.println("Cuisson 25 minutes à 180°");
    }
    void couper() {

        System.out.println("Découpage en parts triangulaires");
    }
    void emballer() {

        System.out.println("Emballage dans une boîte offcielle");
    }
    void setNom(String nom){
        this.nom=nom;
    }
    public String getNom() {
        return this.nom;
    }
    public String toString() {
        // code qui affche la pizza
        return "";
    }

    public void printLegumes() {
        if (legumes != null) {
            System.out.println("Légumes :");
            for (Legumes legume : legumes) {
                System.out.println("\t> " + legume.getNom());
            }
        } else {
            System.out.println("Il n'y a pas de légumes dans la pizza.");
        }
    }

    void setPrix(float prix){ this.prix = prix;}
    public float getPrix(){ return this.prix; }
    //public String getPate(){ return pate;}
    //public String getSauce(){ return sauce;}
}
