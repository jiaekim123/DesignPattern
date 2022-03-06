package design.pattern.ch9.composite.basic;

public interface Shape {
    void draw(String fillColor);

    void move(Integer x, Integer y);

    void print();

    default String getDefaultColor() {
        return "BLUE";
    }
}
