package builderpattern;

import java.util.List;

//The PizzaBuilder class is used to construct Pizza objects using the Builder pattern.
public class PizzaBuilder {
    private int size;
    private String crustType;
    private String sauceType;
    private List<String> toppings;
    // Sets the size of the pizza.
    public PizzaBuilder size(int size) {
        this.size = size;
        return this;
    }
    // Sets the type of crust for the pizza.
    public PizzaBuilder crust(String crustType) {
        this.crustType = crustType;
        return this;
    }
    // Sets the type of sauce for the pizza.
    public PizzaBuilder sauce(String sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    // Sets the list of toppings for the pizza.
    public PizzaBuilder toppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    // Builds and returns a new Pizza object using the values set on this builder.
    public Pizza build() {
        return new Pizza(size, crustType, sauceType, toppings);
    }
}
