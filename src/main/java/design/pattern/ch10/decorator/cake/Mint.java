package design.pattern.ch10.decorator.cake;

public class Mint extends CakeComponentDecorator {
    public Mint(CakeComponent cakeComponent) {
        super(cakeComponent);
    }

    @Override
    public String decorate() {
        return decorateCake() + super.decorate();
    }

    private String decorateCake() {
        return "민트 ";
    }


}
