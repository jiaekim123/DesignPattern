package design.pattern.ch12.flyweight.morse;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, Morse> pool;

    public Factory() {
        this.pool = new HashMap<>();
        pool.put("G", new MorseG());
        pool.put("E", new MorseE());
        pool.put("L", new MorseL());
        pool.put("O", new MorseO());
    }

    public Morse getCode(String code) {
        return pool.get(code);
    }
}
