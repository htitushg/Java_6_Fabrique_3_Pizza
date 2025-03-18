public class PizzaPoivrons extends Pizza{
    FabriqueIngredientsPizza fabriqueIngredients;
    public PizzaPoivrons(FabriqueIngredientsPizza fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
        float prix = 15.5f;
    }
    void preparer() {
        System.out.println("Préparation de " + nom );
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
        legumes = fabriqueIngredients.creerLegumes();
        System.out.println("Préparation de " + nom + ": " + pate.getNom() +  ", " + sauce.getNom() +  ", " +  fromage.getNom() );

    }
    void couper() {
        System.out.println("Découpage en 12 parts");
    }
    void emballer() {

        System.out.println("Emballage dans une boîte carrée");
    }
}