package design.pattern.factory;

public enum CoffeeType {
    AMERICANO("AMERICANO", "아메리카노"),
    CAFE_LATTE("CAFE_LATTE", "카페 라떼"),
    VANILLA_LATTE("VANILLA_LATTE", "바닐라 라떼"),
    ;
    private final String code;
    private final String displayName;

    CoffeeType(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public String getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }
}
