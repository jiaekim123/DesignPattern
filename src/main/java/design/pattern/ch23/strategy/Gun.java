package design.pattern.ch23.strategy;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("총을 발포합니다.");
    }
}
