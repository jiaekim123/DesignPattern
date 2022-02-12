package design.pattern.ch16.visitor.basic;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {

    private final List<Element> elementList;

    public Document(String uuid) {
        super(uuid);
        this.elementList = new ArrayList<>();
    }

    @Override
    public void accept(Visitor v) {
        for (Element e : this.elementList) {
            e.accept(v);
        }
    }

    public List<Element> getElementList() {
        return elementList;
    }
}
