package design.pattern.ch11.facade.basic;

public interface Engine {
    void start();

    void stop();

    EngineStatus status();
}
