package design.pattern.ch8.bridge.basic;

public class Korean implements Hello {
    @Override
    public String greeting() {
        return "안녕하세요.";
    }
}
