public class PizzaFruitsDeMerStyleBrest  extends Pizza{
    FabriqueIngredientsPizza fabriqueIngredients;

    public PizzaFruitsDeMerStyleBrest(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
        float prix = 19.5f;
    }
    void preparer() {
        System.out.println("Préparation de " + nom );
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        fruitsDeMer = fabriqueIngredients.creerFruitsDeMer();
        System.out.println("Préparation de " + nom + ": " + pate.getNom() +  ", " + sauce.getNom() +  ", " +  fromage.getNom() +  ", " +  fruitsDeMer.getNom());

    }
    //float getPrix(){ return this.prix;}
}
