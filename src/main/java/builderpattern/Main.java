package builderpattern;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a new Pizza object using the PizzaBuilder class.
        Pizza pizza = new PizzaBuilder().size(12)
                              .crust("thick")
                              .sauce("pizza sauce")
                              .toppings(Arrays.asList("cheese", "onion", "mushrooms", "capsicum"))
                              .build();
        System.out.println(pizza);
    }
}
