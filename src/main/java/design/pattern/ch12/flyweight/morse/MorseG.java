package design.pattern.ch12.flyweight.morse;

public class MorseG implements Morse {

    @Override
    public void code() {
        System.out.println("*");
        System.out.println("*");
        System.out.println("-");
        System.out.println("*");
        System.out.println(" ");
    }
}
