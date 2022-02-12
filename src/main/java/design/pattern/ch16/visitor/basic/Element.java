package design.pattern.ch16.visitor.basic;

public abstract class Element {
    public String uuid;

    protected Element(String uuid) {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);
}
