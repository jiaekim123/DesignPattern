package design.pattern.ch23.strategy;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("칼을 휘두릅니다.");
    }
}
