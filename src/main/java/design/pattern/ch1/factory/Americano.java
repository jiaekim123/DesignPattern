package design.pattern.ch1.factory;

public class Americano implements Coffee{

    @Override
    public String getName() {
        return CoffeeType.AMERICANO.getDisplayName();
    }
}
