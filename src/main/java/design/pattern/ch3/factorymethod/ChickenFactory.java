package design.pattern.ch3.factorymethod;

public abstract class ChickenFactory {
    abstract Chicken create(ChickenType type);
    abstract String getFactoryName();
}
