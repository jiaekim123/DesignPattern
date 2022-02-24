package design.pattern.ch22.template;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChickenBurger extends HamburgerTemplate {
    @Override
    protected String bread() {
        return "빵";
    }

    @Override
    protected List<String> meatList() {
        return Collections.singletonList("치킨");
    }

    @Override
    protected String source() {
        return "달달구리 소스";
    }

    @Override
    protected List<String> vegetableList() {
        return Arrays.asList("양배추", "토마토");
    }
}
