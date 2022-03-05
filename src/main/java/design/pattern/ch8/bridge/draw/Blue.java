package design.pattern.ch8.bridge.draw;

public class Blue implements Color {
    @Override
    public String fill() {
        return "파란색";
    }
}
