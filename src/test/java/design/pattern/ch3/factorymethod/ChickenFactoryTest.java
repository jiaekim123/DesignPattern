package design.pattern.ch3.factorymethod;

import design.pattern.ch3.factorymethod.Chicken;
import design.pattern.ch3.factorymethod.ChickenFactory;
import design.pattern.ch3.factorymethod.ChickenType;
import design.pattern.ch3.factorymethod.YellowChickenFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ChickenFactoryTest {

    @DisplayName("후라이드 치킨 만들기")
    @Test
    void createFriedChicken() {
        ChickenFactory chickenFactory = new YellowChickenFactory();
        Chicken chicken = chickenFactory.create(ChickenType.FRIED_CHICKEN);
        
        System.out.println(chickenFactory.getFactoryName() + "에서 즐기는 맛있는 "+ chicken.getName());
        Assertions.assertEquals(ChickenType.FRIED_CHICKEN.getValue(), chicken.getName());
    }

    @DisplayName("양념 치킨 만들기")
    @Test
    void createSweetSpiceChicken() {
        ChickenFactory chickenFactory = new YellowChickenFactory();
        Chicken chicken = chickenFactory.create(ChickenType.SWEET_SPICE_CHICKEN);

        System.out.println(chickenFactory.getFactoryName() + "에서 즐기는 맛있는 "+ chicken.getName());
        Assertions.assertEquals(ChickenType.SWEET_SPICE_CHICKEN.getValue(), chicken.getName());
    }

    @DisplayName("간장 치킨 만들기")
    @Test
    void createSoySauceChicken() {
        ChickenFactory chickenFactory = new YellowChickenFactory();
        Chicken chicken = chickenFactory.create(ChickenType.SOY_SAUCE_CHICKEN);

        System.out.println(chickenFactory.getFactoryName() + "에서 즐기는 맛있는 "+ chicken.getName());
        Assertions.assertEquals(ChickenType.SOY_SAUCE_CHICKEN.getValue(), chicken.getName());
    }
}