package design.pattern.factory;

import java.util.Random;

public class Customer {
    public String drinkCoffee(CoffeeType type){
        Coffee coffee = CoffeeFactory.getInstance(type);
        return coffee.getName();
    }
}
