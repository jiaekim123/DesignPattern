package design.pattern.ch3.factorymethod;

public abstract class YellowChickenFactory {
    abstract Chicken create(ChickenType type);

    abstract String getFactoryName();
}
