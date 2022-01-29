package design.pattern.ch10.decorator.cake;

public class Mint extends CakeDecorator {
    public Mint(Cake cake) {
        super(cake);
    }

    @Override
    public String decorate() {
        return decorateCake() + super.decorate();
    }

    private String decorateCake() {
        return "민트 ";
    }


}
