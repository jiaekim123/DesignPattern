package design.pattern.ch11.facade.basic;

public class CarKeyNotMatchException extends IllegalArgumentException {

    public CarKeyNotMatchException() {
        super("키가 맞지 않습니다.");
        System.out.println("CarKeyNotMatchException");
    }
}
