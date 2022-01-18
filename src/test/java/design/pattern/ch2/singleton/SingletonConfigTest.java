package design.pattern.ch2.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SingletonConfigTest {

    @DisplayName("싱글턴으로 생성한 Config 객체의 주소가 일치한다.")
    @Test
    void singletonTest() {
        // given
        SingletonConfig singletonConfig1 = SingletonConfig.getInstance();
        SingletonConfig singletonConfig2 = SingletonConfig.getInstance();

        // when

        // then
        Assertions.assertEquals(singletonConfig1, singletonConfig2);
    }

    @DisplayName("일반 객체로 생성한 Config 객체의 주소가 일치하지 않는다.")
    @Test
    void normalObjectTest() {
        // given
        NormalConfig config1 = new NormalConfig();
        NormalConfig config2 = new NormalConfig();

        // when

        // then
        Assertions.assertNotEquals(config1, config2);
    }
}