package design.pattern.ch10.decorator.cake;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CakeComponentTest {
    @Test
    @DisplayName("초코 케이크")
    void cakeTest1() {
        CakeComponent cakeComponent = new Chocolate(new CakeConcreteComponent());
        assertEquals("초코 케이크", cakeComponent.decorate());
    }

    @Test
    @DisplayName("초코 초코 딸기 케이크")
    void cakeTest2() {
        CakeComponent cakeComponent = new Chocolate(new Chocolate(new Strawberry(new CakeConcreteComponent())));
        assertEquals("초코 초코 딸기 케이크", cakeComponent.decorate());
    }

    @Test
    @DisplayName("민트 딸기 초코 케이크")
    void cakeTest3() {
        CakeComponent cakeComponent = new Mint(new Strawberry(new Chocolate(new CakeConcreteComponent())));
        assertEquals("민트 딸기 초코 케이크", cakeComponent.decorate());
    }
}