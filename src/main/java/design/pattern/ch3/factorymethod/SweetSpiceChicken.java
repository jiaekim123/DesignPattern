package design.pattern.ch3.factorymethod;

public class SweetSpiceChicken extends Chicken{

    @Override
    public String getName() {
        return ChickenType.SWEET_SPICE_CHICKEN.getValue();
    }
}
