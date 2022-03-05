package design.pattern.ch8.bridge.draw;

public class HBPencil extends Brush {
    public static final String type = "[HB 연필]";

    public HBPencil(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}
