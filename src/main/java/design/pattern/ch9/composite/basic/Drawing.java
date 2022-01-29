package design.pattern.ch9.composite.basic;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapeList = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape shape : shapeList) {
            shape.draw(fillColor);
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
