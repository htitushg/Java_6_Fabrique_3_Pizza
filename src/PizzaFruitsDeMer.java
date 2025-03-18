public class PizzaFruitsDeMer  extends Pizza{
    FabriqueIngredientsPizza fabriqueIngredients;
    public PizzaFruitsDeMer(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
        float prix = 18;
    }
    void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        fruitsDeMer = fabriqueIngredients.creerFruitsDeMer();
        System.out.println("Préparation de " + nom + ": " + pate.getNom() +  ", " + sauce.getNom() +  ", " +  fromage.getNom() );

    }

}