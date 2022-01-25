package design.pattern.ch8.bridge.basic;

public class English implements Hello {

    @Override
    public String greeting() {
        return "hello";
    }
}
