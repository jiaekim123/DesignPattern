package design.pattern.ch12.flyweight.morse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MorseTest {
    @Test
    @DisplayName("모스 부호 테스트")
    void morseTest() {
        Factory factory = new Factory();
        factory.getCode("L").code();
        factory.getCode("O").code();
        factory.getCode("L").code();
    }
}