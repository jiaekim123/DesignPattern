package design.pattern.ch5.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhatIfOfficeTest {
    @Test
    @DisplayName("WhatIf...EffectiveJava Builder..?")
    void whatIfOfficeTest(){
        WhatIfOffice office = new WhatIfOffice.Builder()
                .worker("노예1호")
                .pc("윈도우 PC")
                .workspace("회사")
                .build();

        System.out.println(office.toString());
        assertEquals("What If... Office를 만든 빌더가 EffectiveJava 에서 말한거 였다면..?{worker='노예1호', workspace='회사', pc='윈도우 PC'}",
                office.toString());
    }
}