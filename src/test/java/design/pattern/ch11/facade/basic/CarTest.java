package design.pattern.ch11.facade.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CarTest {
    @Test
    @DisplayName("현대자동차 운행 테스트")
    void carDriveTest() {
        String key = "CAR_SECRET_KEY";
        Car car = new HCar(new HEngine(), key);
        car.open(key);
        car.drive(key);
        car.stop();
    }

    @Test
    @DisplayName("현대자동차 잘못된 키 테스트")
    void carDriveInvalidTest() {
        String key = "CAR_SECRET_KEY";
        Car car = new HCar(new HEngine(), key);
        assertThrows(CarKeyNotMatchException.class, () -> car.open("INVALID_KEY"));
    }
}