public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeriaBrest = new PizzeriaBrest();
        pizzeriaBrest.commanderPizza("fromage", "Luc");
        pizzeriaBrest.commanderPizza("fruitsDeMer", "Pierre");
        pizzeriaBrest.commanderPizza("poivrons", "Pierre");
        Pizzeria pizzeriaStrasbourg = new PizzeriaStrasbourg();
        pizzeriaStrasbourg.commanderPizza("fruitsDeMer", "Gerald");
        pizzeriaStrasbourg.commanderPizza("vegetarienne", "Gerald");
        Pizzeria pizzeriaMarseille = new PizzeriaMarseille();
        pizzeriaMarseille.commanderPizza("fruitsDeMer", "Marius");
        pizzeriaMarseille.commanderPizza("vegetarienne", "Fanny");

    }
}