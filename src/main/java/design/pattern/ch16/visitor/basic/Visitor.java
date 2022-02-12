package design.pattern.ch16.visitor.basic;

public interface Visitor {
    void visit(JsonElement element);

    void visit(XmlElement xmlElement);
}
