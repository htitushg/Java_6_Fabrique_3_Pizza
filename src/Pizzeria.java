public abstract class Pizzeria {
    // Methode de fabrique abstraite
    public Pizza commanderPizza(String type, String client) {
        Pizza pizza ;
        pizza = creerPizza(type);
        pizza.preparer();
        pizza.printLegumes();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();

        System.out.println("Client : " + client + "\n" + pizza.getNom() + " Prix = " + pizza.getPrix() + " €\n");
        return pizza;
    }
    abstract Pizza creerPizza(String type);
    // autres méthodes
}
