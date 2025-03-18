public class PizzaFromageStyleBrest extends Pizza {
    FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaFromageStyleBrest(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
        float prix = 16f;
    }
    void preparer () {
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        legumes = fabriqueIngredients.creerLegumes();
        System.out.println("Préparation de " + nom + ": " + pate.getNom() +  ", " + sauce.getNom() +  ", " +  fromage.getNom() );
    }
    void cuire() {
        System.out.println("Cuisson 30 minutes à 160°");
    }
    void couper() {
        System.out.println("Découpage en parts carrées");
    }
}
