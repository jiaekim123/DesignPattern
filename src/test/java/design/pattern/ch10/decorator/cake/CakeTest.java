package design.pattern.ch10.decorator.cake;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CakeTest {
    @Test
    @DisplayName("초코 케이크")
    void cakeTest1() {
        Cake cake = new Chocolate(new CakeImpl());
        assertEquals("초코 케이크", cake.decorate());
    }

    @Test
    @DisplayName("초코 초코 딸기 케이크")
    void cakeTest2() {
        Cake cake = new Chocolate(new Chocolate(new Strawberry(new CakeImpl())));
        assertEquals("초코 초코 딸기 케이크", cake.decorate());
    }

    @Test
    @DisplayName("민트 딸기 초코 케이크")
    void cakeTest3() {
        Cake cake = new Mint(new Strawberry(new Chocolate(new CakeImpl())));
        assertEquals("민트 딸기 초코 케이크", cake.decorate());
    }
}