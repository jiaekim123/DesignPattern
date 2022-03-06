package design.pattern.ch9.composite.basic;

import java.util.ArrayList;
import java.util.List;

public class ShapeComposite implements Shape {

    private final List<Shape> shapeList = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape shape : shapeList) {
            shape.draw(fillColor);
        }
    }

    @Override
    public void move(Integer x, Integer y) {
        for (Shape shape : shapeList) {
            shape.move(x, y);
        }
    }

    @Override
    public void print() {
        for (Shape shape : shapeList) {
            shape.print();
        }
    }

    public void add(Shape shape) {
        shapeList.add(shape);
    }

    public void remove(Shape shape) {
        shapeList.remove(shape);
    }

    public void clear() {
        System.out.println("clear");
        shapeList.clear();
    }
}
