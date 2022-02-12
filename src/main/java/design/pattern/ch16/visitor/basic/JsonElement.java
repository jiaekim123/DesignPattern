package design.pattern.ch16.visitor.basic;

public class JsonElement extends Element {
    public JsonElement(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
