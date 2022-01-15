package design.pattern.factory;

public class CoffeeFactory {

    public static Coffee getInstance(CoffeeType randomTodayPick) {
        switch (randomTodayPick) {
            case AMERICANO:
                return new Americano();

            case CAFE_LATTE:
                return new CafeLatte();

            case VANILLA_LATTE:
                return new VanillaLatte();

        }
        throw new IllegalArgumentException("잘못된 커피 요청입니다.");
    }
}
