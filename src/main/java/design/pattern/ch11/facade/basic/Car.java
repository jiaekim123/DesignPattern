package design.pattern.ch11.facade.basic;

public interface Car {
    void open(String key);

    void drive(String key);

    void stop();

    String getName();
}
