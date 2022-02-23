package design.pattern.ch20.state.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    @DisplayName("라디오 테스트")
    void radioTest() {
        Radio radio = new Radio();
        radio.button();
        radio.button();
    }
}