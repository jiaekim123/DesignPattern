package design.pattern.ch10.decorator.cake;

public abstract class CakeDecorator implements Cake {
    private final Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String decorate() {
        return cake.decorate();
    }
}
