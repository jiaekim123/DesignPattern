package design.pattern.ch20.state.basic;

public class Off implements PowerState {
    @Override
    public PowerState button() {
        System.out.println("전원이 켜졌습니다.");
        return new On();
    }
}
