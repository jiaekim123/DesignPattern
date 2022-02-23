package design.pattern.ch16.visitor.basic;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(Element element) {
        System.out.println("Element [" + element.uuid + "]");
    }

}
