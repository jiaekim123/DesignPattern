package design.pattern.ch3.factorymethod;

public enum ChickenType {
    FRIED_CHICKEN("FRIED_CHICKEN", "후라이드 치킨"),
    SWEET_SPICE_CHICKEN("SWEET_SPICE_CHICKEN", "양념치킨"),
    SOY_SAUCE_CHICKEN("SOY_SAUCE_CHICKEN", "간장 치킨"),
    ;

    private final String code;
    private final String value;

    ChickenType(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
