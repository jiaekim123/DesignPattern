package design.pattern.ch22.template;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HamburgerTest {
    @Test
    @DisplayName("치킨버거 테스트")
    void chickenTest() {
        HamburgerTemplate hamburgerTemplate = new ChickenBurger();
        Hamburger hamburger = hamburgerTemplate.make();
    }

    @Test
    @DisplayName("불고기버거 테스트")
    void bulgogiTest() {
        HamburgerTemplate hamburgerTemplate = new BulgogiBurger();
        Hamburger hamburger = hamburgerTemplate.make();
    }
}