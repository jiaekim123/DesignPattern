package design.pattern.ch4.abstfactory;

public class StateTireProduct extends TireProduct {
    public StateTireProduct() {
    }

    @Override
    public String makeAssemble() {
        return "미국산 타이어";
    }
}
