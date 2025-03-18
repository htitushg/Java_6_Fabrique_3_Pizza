public class PizzaFromageStyleStrasbourg extends Pizza {
    FabriqueIngredientsPizza fabriqueIngredients;
    public PizzaFromageStyleStrasbourg(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
        float prix = 16.3f;
    }
    void preparer() {
        System.out.println("Préparation de " + nom );
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        System.out.println("Préparation de " + nom + ": " + pate.getNom() +  ", " + sauce.getNom() +  ", " +  fromage.getNom() );

    }
    void cuire() {
        System.out.println("Cuisson 35 minutes à 200°");
    }
    void couper() {
        System.out.println("Découpage en parts losange");
    }
}