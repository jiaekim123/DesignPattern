package design.pattern.ch9.composite.basic;

public class Triangle implements Shape {
    private final Point point;
    private String color;

    public Triangle() {
        this.point = new Point();
        this.color = getDefaultColor();
    }

    @Override
    public void draw(String fillColor) {
        this.color = fillColor;
    }

    @Override
    public void move(Integer x, Integer y) {
        point.move(x, y);
    }

    @Override
    public void print() {
        System.out.println("[Triangle][" + color + "] " + point.toString());
    }

}
