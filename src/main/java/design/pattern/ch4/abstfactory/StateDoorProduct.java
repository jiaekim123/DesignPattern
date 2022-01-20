package design.pattern.ch4.abstfactory;

public class StateDoorProduct extends DoorProduct {

    @Override
    public String makeAssemble() {
        return "Door is open";
    }
}
