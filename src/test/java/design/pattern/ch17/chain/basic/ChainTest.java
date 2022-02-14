package design.pattern.ch17.chain.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ChainTest {

    @Test
    @DisplayName("체인 테스트")
    void chainTest() {
        Chain chain = new Chain();
        chain.process(new Number(90));
        chain.process(new Number(-50));
        chain.process(new Number(0));
        chain.process(new Number(91));
    }
}