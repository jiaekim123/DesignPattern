package design.pattern.ch4.abstfactory;

public class KoreaDoorProduct extends DoorProduct {
    @Override
    public String makeAssemble() {
        return "문이 열립니다.";
    }
}
