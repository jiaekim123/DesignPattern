package design.pattern.ch23.strategy;

public class Character extends Strategy {
    @Override
    public void attack() {
        if (this.delegate == null) {
            System.out.println("맨손 공격");
        } else {
            this.delegate.attack();
        }
    }
}
