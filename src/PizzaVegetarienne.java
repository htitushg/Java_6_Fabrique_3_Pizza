public class PizzaVegetarienne  extends Pizza{
    FabriqueIngredientsPizza fabriqueIngredients;
    public PizzaVegetarienne(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
        float prix = 15;
    }
    void preparer() {
        System.out.println("Préparation de " + nom );
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        legumes = fabriqueIngredients.creerLegumes();
        System.out.println("Préparation de " + nom + ": " + pate.getNom() +  ", " + sauce.getNom() +  ", " +  fromage.getNom() );

    }
    // float getPrix(){
    //     return this.prix;
    // };
}