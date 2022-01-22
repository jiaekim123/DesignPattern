package design.pattern.ch6.prototype;


import java.util.HashMap;
import java.util.Map;

public class Developer implements Cloneable {
    private String name;
    private Integer workingYear; // 연차...
    private Map<String, Integer> languageMap;
    private Map<String, Integer> skillMap;

    public Developer(String name) {
        this.name = name;
        this.workingYear = 1;
        this.languageMap = new HashMap<>();
        this.skillMap = new HashMap<>();
    }

    public Developer(String name, Integer workingYear, Map<String, Integer> languageMap, Map<String, Integer> skillMap) {
        this.name = name;
        this.workingYear = workingYear;
        this.languageMap = languageMap;
        this.skillMap = skillMap;
    }

    public void upgradeLanguage(String language) {
        languageMap.put(language, languageMap.getOrDefault(language, 0) + 1);
    }

    public void upgradeSkill(String skill) {
        skillMap.put(skill, skillMap.getOrDefault(skill, 0) + 1);
    }

    public void upgradeWorkingYear() {
        this.workingYear++;
    }

    public String getName() {
        return name;
    }

    public Integer getWorkingYear() {
        return workingYear;
    }

    public Map<String, Integer> getLanguageMap() {
        return languageMap;
    }

    public Map<String, Integer> getSkillMap() {
        return skillMap;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        String name = this.name + "_clone";
        Integer workingYear = this.workingYear;
        Map<String, Integer> skillMap = new HashMap<>();
        for (String key : this.skillMap.keySet()) {
            skillMap.put(key, this.skillMap.get(key));
        }
        Map<String, Integer> languageMap = new HashMap<>();
        for (String key : this.languageMap.keySet()) {
            languageMap.put(key, this.languageMap.get(key));
        }

        return new Developer(name, workingYear, languageMap, skillMap);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", workingYear=" + workingYear +
                ", languageMap=" + languageMap +
                ", skillMap=" + skillMap +
                '}';
    }
}
