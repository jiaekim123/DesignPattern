package design.pattern.ch11.facade.basic;

public class HDoors implements Doors {
    private boolean lock;
    private CarKey key;

    public HDoors(CarKey key) {
        this.key = key;
        this.lock = true;
    }

    @Override
    public void locks(String key) {
        if (!this.key.turns(key)) {
            throw new CarKeyNotMatchException();
        }
        System.out.println("문이 닫혔습니다.");
    }

    @Override
    public void unlocks(String key) {
        if (!this.key.turns(key)) {
            throw new CarKeyNotMatchException();
        }
        System.out.println("문이 열렸습니다..");
    }

    public CarKey getKey() {
        return key;
    }
}
