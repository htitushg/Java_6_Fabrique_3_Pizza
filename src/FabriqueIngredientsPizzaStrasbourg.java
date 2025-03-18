public class FabriqueIngredientsPizzaStrasbourg implements FabriqueIngredientsPizza{
    public Pate creerPate() {
        return new PateEpaisse();
    }
    public Sauce creerSauce() {
        return new SauceBolognese();
    }
    public Fromage creerFromage() {
        return new Emmental();
    }
    public Legumes[] creerLegumes() {
        return new Legumes[]{ new Ail(), new Oignon(), new Champignon(), new Poivrons(), new PoivronRouge() };
    }
    public FruitsDeMer creerFruitsDeMer() {
        return new MoulesSurgelees();
    }
    //public float prix ;
}
