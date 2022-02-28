package design.pattern.ch3.factorymethod;

public class YellowChickenChainFactory extends YellowChickenFactory {
    @Override
    Chicken create(ChickenType type) {
        switch (type) {
            case FRIED_CHICKEN:
                return new FriedChicken();
            case SOY_SAUCE_CHICKEN:
                return new SoySauceChicken();
            case SWEET_SPICE_CHICKEN:
                return new SweetSpiceChicken();
        }
        return null;
    }

    @Override
    String getFactoryName() {
        return "노랑 통닭 강남점";
    }

}
