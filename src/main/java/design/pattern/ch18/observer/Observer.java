package design.pattern.ch18.observer;

public abstract class Observer {
    private String name;

    public abstract void update();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
