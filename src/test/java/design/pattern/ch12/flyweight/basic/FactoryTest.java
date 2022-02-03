package design.pattern.ch12.flyweight.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FactoryTest {

    @Test
    @DisplayName("팩토리로 인사 객체 생성")
    void helloTest() {
        Hello hello1 = (new Factory()).make("Hello");
        Hello hello2 = (new Factory()).make("Hello");

        if (hello1 == hello2) {
            System.out.println("동일한 객체입니다.");
        } else {
            System.out.println("서로 다른 객체입니다.");
        }
    }
}