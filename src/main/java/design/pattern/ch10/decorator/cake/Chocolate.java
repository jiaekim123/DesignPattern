package design.pattern.ch10.decorator.cake;

public class Chocolate extends CakeDecorator {
    public Chocolate(Cake cake) {
        super(cake);
    }

    @Override
    public String decorate() {
        return decorateCake() + super.decorate();
    }

    private String decorateCake() {
        return "초코 ";
    }

}
