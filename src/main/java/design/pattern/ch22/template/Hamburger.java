package design.pattern.ch22.template;

import java.util.List;

public class Hamburger {
    private String bread;
    private List<String> meat;
    private String source;
    private List<String> vegetable;

    @Override
    public String toString() {
        return "Hamburger{" +
                "bread='" + bread + '\'' +
                ", meat=" + meat +
                ", source='" + source + '\'' +
                ", vegetable=" + vegetable +
                '}';
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setMeat(List<String> meat) {
        this.meat = meat;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setVegetable(List<String> vegetable) {
        this.vegetable = vegetable;
    }
}
