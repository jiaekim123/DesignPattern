package design.pattern.ch22.template;

import java.util.List;

public abstract class HamburgerTemplate {

    public final Hamburger make() {
        System.out.println("==햄버거 만들기==");
        Hamburger hamburger = new Hamburger();

        String bread = bread();
        System.out.println("1. 빵 올리기 : " + bread);
        hamburger.setBread(bread);

        List<String> meatList = meatList();
        System.out.println("2. 고기 올리기: " + meatList);
        hamburger.setMeat(meatList);

        String source = source();
        System.out.println("3. 소스 올리기: " + source);
        hamburger.setSource(source);

        List<String> vegetableList = vegetableList();
        System.out.println("4. 야채 올리기: " + vegetableList);
        hamburger.setVegetable(vegetableList);

        System.out.println("==완성==");
        return hamburger;
    }

    protected abstract String bread();

    protected abstract List<String> meatList();

    protected abstract String source();

    abstract protected List<String> vegetableList();

}
