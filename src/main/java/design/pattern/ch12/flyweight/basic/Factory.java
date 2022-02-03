package design.pattern.ch12.flyweight.basic;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, Hello> pool;

    public Factory() {
        this.pool = new HashMap<>();
    }

    public Hello make(String name) {
        if (pool.containsKey(name)) {
            System.out.println("팩토리 생성 요청: " + name + "\n");
            return pool.get(name);
        }
        pool.put(name, Hello.getInstance());
        return pool.get(name);
    }
}
