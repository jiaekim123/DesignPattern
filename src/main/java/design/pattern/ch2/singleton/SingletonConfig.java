package design.pattern.ch2.singleton;

public class SingletonConfig {
    private static SingletonConfig singletonConfig = null;

    private SingletonConfig() {
    }

    public static synchronized SingletonConfig getInstance() {
        if (singletonConfig == null) {
            singletonConfig = new SingletonConfig();
        }
        return singletonConfig;
    }
}
