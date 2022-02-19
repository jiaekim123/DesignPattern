package design.pattern.ch20.state.basic;

public class Radio {
    private PowerState powerState;

    public Radio() {
        System.out.println(this.getClass().getSimpleName());
        this.powerState = new Off();
    }

    public void button() {
        powerState = powerState.button();
    }
}
