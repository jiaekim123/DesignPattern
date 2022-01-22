package design.pattern.ch6.prototype;

public class Skill {
    private static final Integer DEFAULT_LEVEL = 1;
    private String name;
    private Integer level;

    public Skill(String name) {
        this.name = name;
        this.level = DEFAULT_LEVEL;
    }

    public Skill(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }
}
