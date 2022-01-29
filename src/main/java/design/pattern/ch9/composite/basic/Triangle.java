package design.pattern.ch9.composite.basic;

public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println(String.format("[%s]Drawing Triangle", fillColor));
    }
}
