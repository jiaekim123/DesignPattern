package design.pattern.ch9.composite.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DrawingTest {
    @Test
    @DisplayName("모든 도형을 그린다.")
    void drawShape() {
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(triangle2);
        drawing.add(circle);

        drawing.draw("RED");

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(drawing);
        shapeList.add(new Triangle());
        shapeList.add(new Circle());

        for (Shape shape : shapeList) {
            shape.draw("GREEN");
        }
    }
}