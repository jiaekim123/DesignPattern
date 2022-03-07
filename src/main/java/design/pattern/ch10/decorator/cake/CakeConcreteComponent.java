package design.pattern.ch10.decorator.cake;

public class CakeConcreteComponent implements CakeComponent {
    @Override
    public String decorate() {
        return "케이크";
    }
}

