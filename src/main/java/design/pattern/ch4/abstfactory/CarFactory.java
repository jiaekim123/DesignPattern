package design.pattern.ch4.abstfactory;

public abstract class CarFactory {
    public abstract TireProduct createTire();
    public abstract DoorProduct createDoor();
}
