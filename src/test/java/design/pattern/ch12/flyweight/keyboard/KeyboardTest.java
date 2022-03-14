package design.pattern.ch12.flyweight.keyboard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KeyboardTest {
    @Test
    @DisplayName("키보드 부호 테스트")
    void morseTest() {
        Factory factory = new Factory();
        factory.getButton("A").button();
        factory.getButton("B").button();
        factory.getButton("C").button();
        factory.getButton("D").button();

    }
}