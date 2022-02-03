package design.pattern.ch13.proxy.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RealSubjectTest {
    @Test
    @DisplayName("RealSubject 바로 호출하기")
    void action() {
        RealSubject realSubject = new RealSubject();
        realSubject.action1();
        realSubject.action2();
    }
}