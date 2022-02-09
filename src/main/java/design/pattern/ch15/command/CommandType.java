package design.pattern.ch15.command;

public enum CommandType {
    COMMAND_MUSIC_ON("COMMAND_MUSIC_ON", "음악 켜줘"),
    COMMAND_MUSIC_OFF("COMMAND_MUSIC_ON", "음악 꺼줘"),
    ;
    private final String code;
    private final String value;


    CommandType(String code, String value) {
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
