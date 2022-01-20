package design.pattern.ch4.abstfactory;

public class KoreaCarFactory extends CarFactory{
    public KoreaCarFactory() {

    }

    @Override
    public TireProduct createTire() {
        return new KoreaTireProduct();
    }

    @Override
    public DoorProduct createDoor() {
        return new KoreaDoorProduct();
    }
}
