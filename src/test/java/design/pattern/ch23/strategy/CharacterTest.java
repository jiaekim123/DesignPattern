package design.pattern.ch23.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CharacterTest {
    @Test
    @DisplayName("테스트")
    void characterTest() {
        Strategy strategy = new Character();
        strategy.attack();

        strategy.setDelegate(new Knife());
        strategy.attack();

        strategy.setDelegate(new Gun());
        strategy.attack();
    }
}