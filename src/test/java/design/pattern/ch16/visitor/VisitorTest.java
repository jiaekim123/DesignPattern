package design.pattern.ch16.visitor;

import design.pattern.ch16.visitor.basic.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class VisitorTest {
    @Test
    @DisplayName("Visitor 테스트")
    void visitorTest() {
        Visitor visitor = new ElementVisitor();
        Document document = new Document(generateUuid());
        document.getElementList().add(new JsonElement(generateUuid()));
        document.getElementList().add(new JsonElement(generateUuid()));
        document.getElementList().add(new XmlElement(generateUuid()));

        document.accept(visitor);
    }

    private String generateUuid() {
        return UUID.randomUUID().toString();
    }
}