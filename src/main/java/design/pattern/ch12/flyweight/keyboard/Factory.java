package design.pattern.ch12.flyweight.keyboard;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private final Map<String, Keyboard> pool;

    public Factory() {
        this.pool = new HashMap<>();
        pool.put("A", new KeyboardA());
        pool.put("B", new KeyboardB());
        pool.put("C", new KeyboardC());
        pool.put("D", new KeyboardD());
    }

    public Keyboard getButton(String button) {
        return pool.get(button);
    }
}
