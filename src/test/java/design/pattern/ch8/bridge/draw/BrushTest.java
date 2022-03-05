package design.pattern.ch8.bridge.draw;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BrushTest {

    @Test
    @DisplayName("브리지 패턴 테스트")
    void brushColorTest() {
        Brush redBrush = new HBPencil(new Red());
        Assertions.assertThat("[HB 연필] 빨간색".equals(redBrush.draw()));

        Brush blueBrush = new MonoLine(new Blue());
        Assertions.assertThat("[모노라인] 파란색".equals(blueBrush.draw()));
    }
}