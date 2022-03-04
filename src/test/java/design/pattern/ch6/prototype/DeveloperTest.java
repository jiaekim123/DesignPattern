package design.pattern.ch6.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DeveloperTest {
    @Test
    @DisplayName("개발자를 신입부터 양성하고 그대로 복사한다.")
    void makeDeveloper() throws CloneNotSupportedException {
        Developer developer = new Developer("신입개발자");
        developer.upgradeWorkingYear();
        developer.upgradeLanguage("자바"); // 만약 업그레이드하는데 시간이 소모된다면??
        developer.upgradeSkill("프레임워크");
        developer.upgradeSkill("데이터베이스");
        developer.upgradeSkill("리눅스");
        developer.upgradeSkill("클라우드");
        developer.upgradeLanguage("자바");

        Developer cloneDeveloper = developer.clone();
        System.out.println(developer);
        System.out.println(cloneDeveloper);
    }
}