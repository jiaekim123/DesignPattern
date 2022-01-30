package design.pattern.ch11.facade.basic;

public interface Doors {
    void locks(String key);

    void unlocks(String key);

    CarKey getKey();
}
