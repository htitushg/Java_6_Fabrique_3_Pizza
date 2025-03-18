public class PizzeriaStrasbourg extends Pizzeria {
    // Methode de fabrication de pizzas (créateur concret)
    protected Pizza creerPizza(String choix) {
        Pizza pizza = null;
        FabriqueIngredientsPizza fabriqueIngredients = new FabriqueIngredientsPizzaStrasbourg();
        if (choix.equals("fromage")) {
            pizza = new PizzaFromageOld(fabriqueIngredients);
            pizza.setNom("Pizza au fromage style Strasbourg");
            pizza.setPrix(16.5f);
        } else if (choix.equals("vegetarienne")) {
            pizza = new PizzaVegetarienne(fabriqueIngredients);
            pizza.setNom("Pizza végétarienne style Strasbourg");
            pizza.setPrix(17.5f);
        } else if (choix.equals("fruitsDeMer")) {
            pizza = new PizzaFruitsDeMerStyleStrasbourg(fabriqueIngredients);
            pizza.setNom("Pizza aux fruits de mer style Strasbourg");
            pizza.setPrix(22f);
        } else if (choix.equals("poivrons")) {
            pizza = new PizzaPoivrons(fabriqueIngredients);
            pizza.setNom("Pizza aux poivrons style Strasbourg");
            pizza.setPrix(18.5f);
        }
        return pizza;
    }
}

