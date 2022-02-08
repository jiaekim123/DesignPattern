package design.pattern.ch14.iterator;

public class Worker {
    private final String name;
    private final WorkerType type;

    public Worker(String name, WorkerType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public WorkerType getType() {
        return type;
    }
}
