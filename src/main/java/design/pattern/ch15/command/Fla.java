package design.pattern.ch15.command;

/**
 * ConcreteCommand 역할을 하는 플라
 */
public class Fla implements Music {
    @Override
    public void musicOn() {
        System.out.println("플라에서 음악을 재생합니다.");
    }

    @Override
    public void musicOff() {
        System.out.println("플라에서 음악을 끕니다.");
    }
}
