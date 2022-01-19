package design.pattern.ch3.factorymethod;

public class SoySauceChicken extends Chicken{

    @Override
    public String getName() {
        return ChickenType.SOY_SAUCE_CHICKEN.getValue();
    }
}
