package design.pattern.ch6.prototype;


import java.util.HashMap;
import java.util.Map;

public class Developer implements Cloneable {
    private final String name;
    private Integer workingYear; // 연차...
    private final Map<String, Integer> languageMap;
    private final Map<String, Integer> skillMap;

    public Developer(String name) {
        this.name = name;
        this.workingYear = 1;
        this.languageMap = new HashMap<>();
        this.skillMap = new HashMap<>();
    }

    private Developer(String name, Integer workingYear, Map<String, Integer> languageMap, Map<String, Integer> skillMap) {
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
    protected Developer clone() throws CloneNotSupportedException {
        Integer cloneWorkingYear = this.workingYear;
        Map<String, Integer> cloneSkillMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : this.skillMap.entrySet()) {
            cloneSkillMap.put(entry.getKey(), entry.getValue());
        }
        Map<String, Integer> cloneLanguageMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : this.languageMap.entrySet()) {
            cloneLanguageMap.put(entry.getKey(), entry.getValue());
        }

        return new Developer(this.name, cloneWorkingYear, cloneLanguageMap, cloneSkillMap);
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
