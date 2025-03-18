public class PizzeriaMarseille extends Pizzeria {
    // Methode de fabrication de pizzas (créateur concret)
    protected Pizza creerPizza(String choix) {
        Pizza pizza = null;
        FabriqueIngredientsPizza fabriqueIngredients = new FabriqueIngredientsPizzaMarseille();
        if (choix.equals("fromage")) {
            pizza = new PizzaFromageOld(fabriqueIngredients);
            pizza.setNom("Pizza au fromage style Marseille");
            pizza.setPrix(16.5f);
        } else if (choix.equals("vegetarienne")) {
            pizza = new PizzaVegetarienne(fabriqueIngredients);
            pizza.setNom("Pizza végétarienne style Marseille");
            pizza.setPrix(17.5f);
        } else if (choix.equals("fruitsDeMer")) {
            pizza = new PizzaFruitsDeMerStyleMarseille(fabriqueIngredients);
            pizza.setNom("Pizza aux fruits de mer style Marseille");
            pizza.setPrix(19.5f);
        } else if (choix.equals("poivrons")) {
            pizza = new PizzaPoivrons(fabriqueIngredients);
            pizza.setNom("Pizza aux poivrons style Marseille");
            pizza.setPrix(15.5f);
        }
        return pizza;
    }
    }


