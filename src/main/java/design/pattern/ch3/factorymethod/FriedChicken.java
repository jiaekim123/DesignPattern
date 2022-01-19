package design.pattern.ch3.factorymethod;

public class FriedChicken extends Chicken{

    @Override
    public String getName(){
        return ChickenType.FRIED_CHICKEN.getValue();
    }
}
