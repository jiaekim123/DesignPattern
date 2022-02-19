package design.pattern.ch20.state.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TVTest {
    @Test
    @DisplayName("TV 테스트")
    void tvTest() {
        TV tv = new TV();
        tv.button();
        tv.button();
    }
}