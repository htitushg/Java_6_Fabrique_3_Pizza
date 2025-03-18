public class FabriqueIngredientsPizzaMarseille implements FabriqueIngredientsPizza{
    public Pate creerPate() {
        return new PateFine();
    }
    public Sauce creerSauce() {
        return new SauceMarinara();
    }
    public Fromage creerFromage() {
        return new Chevre();
    }
    public Legumes[] creerLegumes() {
        return new Legumes[]{ new Ail(), new OlivesNoires(), new Oignon(), new Champignon(), new Poivrons(), new PoivronRouge() };
    }
    public FruitsDeMer creerFruitsDeMer() {
        return new Poulpe();
    }
    //public float prix ;
}
