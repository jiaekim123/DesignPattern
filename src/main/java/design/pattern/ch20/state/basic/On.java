package design.pattern.ch20.state.basic;


public class On implements PowerState {
    @Override
    public PowerState button() {
        System.out.println("전원이 꺼졌습니다.");
        return new Off();
    }
}
