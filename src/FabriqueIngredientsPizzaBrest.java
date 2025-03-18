public class FabriqueIngredientsPizzaBrest implements FabriqueIngredientsPizza{
    public Pate creerPate() {
        return new PateSoufflee();
    }
    public Sauce creerSauce() {
        return new SauceTomateCerise();
    }
    public Fromage creerFromage() {
        return new Cantal();
    }
    public Legumes[] creerLegumes() {
        return new Legumes[]{ new Ciboulette(), new Oignon(), new Champignon(), new Poivrons(), new PoivronRouge() };
    }
    public Moules creerFruitsDeMer() {
        return new MoulesSurgelees();
    }
    //public float prix ;
}
