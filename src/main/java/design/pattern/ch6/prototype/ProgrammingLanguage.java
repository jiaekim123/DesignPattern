package design.pattern.ch6.prototype;

public class ProgrammingLanguage {
    private final static Integer DEFAULT_LEVEL = 1;
    private String name;
    private Integer level;

    public ProgrammingLanguage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public ProgrammingLanguage(String name) {
        this.name = name;
        this.level = DEFAULT_LEVEL;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }
}
