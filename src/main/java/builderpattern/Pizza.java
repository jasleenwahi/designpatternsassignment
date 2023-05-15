package builderpattern;

import java.util.List;

// This class represents a pizza object which is constructed using the builder pattern.
public class Pizza {
    private int size;
    private String crustType;
    private String sauceType;
    private List<String> toppings;

    public Pizza(int size, String crustType, String sauceType, List<String> toppings) {
        this.size = size;
        this.crustType = crustType;
        this.sauceType = sauceType;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                       "size=" + size +
                       ", crustType='" + crustType + '\'' +
                       ", sauceType='" + sauceType + '\'' +
                       ", toppings=" + toppings +
                       '}';
    }
}
