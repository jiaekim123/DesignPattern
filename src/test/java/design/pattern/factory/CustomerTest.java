package design.pattern.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @DisplayName("아메리카노를 마신다")
    @Test
    void drinkCoffeeAmericano() {
        // given
        Customer customer = new Customer();

        // when
        String coffeeName = customer.drinkCoffee(CoffeeType.AMERICANO);
        System.out.println("오늘은 너로 정했다! " + coffeeName);

        // then
        Assertions.assertEquals(CoffeeType.AMERICANO.getDisplayName(), coffeeName);
    }

    @DisplayName("카페라떼를 마신다")
    @Test
    void drinkCoffeeCafeLatte() {
        // given
        Customer customer = new Customer();

        // when
        String coffeeName = customer.drinkCoffee(CoffeeType.CAFE_LATTE);
        System.out.println("오늘은 너로 정했다! " + coffeeName);

        // then
        Assertions.assertEquals(CoffeeType.CAFE_LATTE.getDisplayName(), coffeeName);
    }

    @DisplayName("바닐라라떼를 마신다")
    @Test
    void drinkCoffeeVanilla() {
        // given
        Customer customer = new Customer();

        // when
        String coffeeName = customer.drinkCoffee(CoffeeType.VANILLA_LATTE);
        System.out.println("오늘은 너로 정했다! " + coffeeName);

        // then
        Assertions.assertEquals(CoffeeType.VANILLA_LATTE.getDisplayName(), coffeeName);
    }


}