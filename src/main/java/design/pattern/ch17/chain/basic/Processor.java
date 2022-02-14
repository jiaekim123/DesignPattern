package design.pattern.ch17.chain.basic;

public abstract class Processor {
    private Processor next;
    protected String name;

    protected Processor(String name) {
        this.name = name;
    }

    public void process(Number request) {
        if (next != null) {
            next.process(request);
        }
    }

    public void setNext(Processor next) {
        this.next = next;
    }
}
