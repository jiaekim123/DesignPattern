package design.pattern.ch4.abstfactory;

public class KoreaTireProduct extends TireProduct {
    public KoreaTireProduct() {
    }

    @Override
    public String makeAssemble() {
        return "국산 타이어";
    }
}
