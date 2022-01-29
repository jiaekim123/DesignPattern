package design.pattern.ch10.decorator.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ChristmasTreeTest {
    @Test
    @DisplayName("크리스마스 트리 가랜드 장식")
    void testGarlandChristmasTree() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        Assertions.assertEquals("Christmas tree with Garland", tree1.decorate());
    }

    @Test
    @DisplayName("크리스마스 트리 가랜드 장식과 버블 장식")
    void testBubbleLightChristmasTree() {
        ChristmasTree tree1 = new Garland(new Garland(new ChristmasTreeImpl()));
        Assertions.assertEquals("Christmas tree with Garland with Garland", tree1.decorate());
    }
}