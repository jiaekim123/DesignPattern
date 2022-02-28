package design.pattern.ch23.strategy;

public abstract class Strategy {

    protected Weapon delegate;

    public void setDelegate(Weapon delegate) {
        System.out.println("무기를 교환합니다.");
        this.delegate = delegate;
    }

    public abstract void attack();
}
