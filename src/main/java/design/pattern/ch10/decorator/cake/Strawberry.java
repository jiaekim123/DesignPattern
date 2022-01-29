package design.pattern.ch10.decorator.cake;

public class Strawberry extends CakeDecorator {
    public Strawberry(Cake cake) {
        super(cake);
    }

    @Override
    public String decorate() {
        return decorateCake() + super.decorate();
    }

    private String decorateCake() {
        return "딸기 ";
    }

}
