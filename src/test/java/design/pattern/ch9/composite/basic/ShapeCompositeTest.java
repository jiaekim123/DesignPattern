package design.pattern.ch9.composite.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ShapeCompositeTest {
    @Test
    @DisplayName("도형을 그리고 한꺼번에 옮긴다")
    void drawShape() {
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        ShapeComposite shapeComposite = new ShapeComposite();
        shapeComposite.add(triangle);
        shapeComposite.add(triangle2);
        shapeComposite.add(circle);

        shapeComposite.print();
        shapeComposite.draw("RED");
        shapeComposite.print();
        shapeComposite.move(1, 1);
        shapeComposite.print();
        shapeComposite.move(2, -3);
        shapeComposite.print();
    }
}