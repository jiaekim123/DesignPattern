package design.pattern.ch20.state.basic;

public class TV {
    private PowerState state;

    public TV() {
        System.out.println(this.getClass().getSimpleName());
        this.state = new Off();
    }

    public void button() {
        state = state.button();
    }
}
