package design.pattern.factory;

public class VanillaLatte implements Coffee{
    @Override
    public String getName() {
        return CoffeeType.VANILLA_LATTE.getDisplayName();
    }
}
