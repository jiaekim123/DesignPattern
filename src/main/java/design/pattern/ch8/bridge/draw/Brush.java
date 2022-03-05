package design.pattern.ch8.bridge.draw;

public abstract class Brush {
    protected Color color;

    protected Brush(Color color) {
        this.color = color;
    }

    public abstract String draw();

}
