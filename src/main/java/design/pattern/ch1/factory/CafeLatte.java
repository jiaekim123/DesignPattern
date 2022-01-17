package design.pattern.ch1.factory;

public class CafeLatte implements Coffee{
    @Override
    public String getName() {
        return CoffeeType.CAFE_LATTE.getDisplayName();
    }
}
