package design.pattern.ch8.bridge.draw;

public class MonoLine extends Brush {
    public static final String type = "[모노라인]";

    public MonoLine(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}
