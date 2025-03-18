public class PizzaFruitsDeMerStyleStrasbourg extends Pizza{
    FabriqueIngredientsPizza fabriqueIngredients;
    public PizzaFruitsDeMerStyleStrasbourg(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
        float prix = 20.5f;
    }
    void preparer() {
        System.out.println("Préparation de " + nom );
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        fruitsDeMer = fabriqueIngredients.creerFruitsDeMer();
        System.out.println("Préparation de " + nom + ": " + pate.getNom() +  ", " + sauce.getNom() +  ", " +  fromage.getNom() +  ", " +  fruitsDeMer.getNom());

    }
}