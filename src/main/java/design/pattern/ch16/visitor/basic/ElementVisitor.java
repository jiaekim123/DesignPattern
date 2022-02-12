package design.pattern.ch16.visitor.basic;

public class ElementVisitor implements Visitor {
    @Override
    public void visit(JsonElement element) {
        System.out.println("JSON element [" + element.uuid + "]");
    }

    @Override
    public void visit(XmlElement element) {
        System.out.println("XML element [" + element.uuid + "]");
    }
}
