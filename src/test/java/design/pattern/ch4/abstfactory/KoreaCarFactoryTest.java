package design.pattern.ch4.abstfactory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    @DisplayName("한국산 차 만들기")
    void makeKoreaCar(){
        // given
        CarFactory carFactory = new KoreaCarFactory();
        TireProduct tireProduct = carFactory.createTire();
        DoorProduct doorProduct = carFactory.createDoor();

        // when
        String tire = tireProduct.makeAssemble();
        String door = doorProduct.makeAssemble();

        // then
        assertEquals("국산 타이어", tire);
        assertEquals("문이 열립니다.", door);
    }


    @Test
    @DisplayName("미국산 차 만들기")
    void makeStateCar(){
        // given
        CarFactory carFactory = new StateCarFactory();
        TireProduct tireProduct = carFactory.createTire();
        DoorProduct doorProduct = carFactory.createDoor();

        // when
        String tire = tireProduct.makeAssemble();
        String door = doorProduct.makeAssemble();

        // then
        assertEquals("미국산 타이어", tire);
        assertEquals("Door is open", door);
    }
}