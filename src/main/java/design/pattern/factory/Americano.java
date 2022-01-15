package design.pattern.factory;

public class Americano implements Coffee{

    @Override
    public String getName() {
        return CoffeeType.AMERICANO.getDisplayName();
    }
}
