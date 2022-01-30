package design.pattern.ch11.facade.basic;

public enum EngineStatus {
    DRIVE("DRIVE", "운행"),
    STOP("STOP", "정지");

    private final String code;
    private final String displayName;

    EngineStatus(String code, String displayName) {
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
