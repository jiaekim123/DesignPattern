package design.pattern.ch3.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class YellowChickenFactoryTest {

    @DisplayName("후라이드 치킨 만들기")
    @Test
    void createFriedChicken() {
        YellowChickenFactory yellowChickenFactory = new YellowChickenChainFactory();
        Chicken chicken = yellowChickenFactory.create(ChickenType.FRIED_CHICKEN);

        System.out.println(yellowChickenFactory.getFactoryName() + "에서 즐기는 맛있는 " + chicken.getName());
        Assertions.assertEquals(ChickenType.FRIED_CHICKEN.getValue(), chicken.getName());
    }

    @DisplayName("양념 치킨 만들기")
    @Test
    void createSweetSpiceChicken() {
        YellowChickenFactory yellowChickenFactory = new YellowChickenChainFactory();
        Chicken chicken = yellowChickenFactory.create(ChickenType.SWEET_SPICE_CHICKEN);

        System.out.println(yellowChickenFactory.getFactoryName() + "에서 즐기는 맛있는 " + chicken.getName());
        Assertions.assertEquals(ChickenType.SWEET_SPICE_CHICKEN.getValue(), chicken.getName());
    }

    @DisplayName("간장 치킨 만들기")
    @Test
    void createSoySauceChicken() {
        YellowChickenFactory yellowChickenFactory = new YellowChickenChainFactory();
        Chicken chicken = yellowChickenFactory.create(ChickenType.SOY_SAUCE_CHICKEN);

        System.out.println(yellowChickenFactory.getFactoryName() + "에서 즐기는 맛있는 " + chicken.getName());
        Assertions.assertEquals(ChickenType.SOY_SAUCE_CHICKEN.getValue(), chicken.getName());
    }
}