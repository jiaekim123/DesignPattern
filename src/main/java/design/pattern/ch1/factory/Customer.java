package design.pattern.ch1.factory;

public class Customer {
    public String drinkCoffee(CoffeeType type){
        Coffee coffee = CoffeeFactory.getInstance(type);
        return coffee.getName();
    }
}
