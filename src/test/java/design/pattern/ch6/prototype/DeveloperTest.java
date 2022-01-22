package design.pattern.ch6.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DeveloperTest {
    @Test
    @DisplayName("개발자를 신입부터 양성한다")
    void makeDeveloper() {
        Developer developer = new Developer("신입개발자");
        developer.upgradeWorkingYear();
        developer.upgradeLanguage("자바"); // 만약 업그레이드하는데 시간이 소모된다면??
        developer.upgradeSkill("프레임워크");
        developer.upgradeSkill("데이터베이스");
        developer.upgradeSkill("리눅스");
        developer.upgradeSkill("클라우드");
        developer.upgradeLanguage("자바");
        System.out.println(developer);
    }

    @Test
    @DisplayName("개발자를 처음부터 양성하는 시간과 잘 만들어진 개발자를 복사하는 시간을 비교한다.")
    void compareDeveloper() {
        
    }
}