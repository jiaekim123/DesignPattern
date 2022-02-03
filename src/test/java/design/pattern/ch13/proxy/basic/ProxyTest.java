package design.pattern.ch13.proxy.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProxyTest {

    @Test
    @DisplayName("프록시 객체 테스트")
    void action() {
        ProxyFactory proxyFactory = new ProxyFactory();
        Subject subject = proxyFactory.getObject();
        subject.action1();
        subject.action2();
    }

    @Test
    @DisplayName("프록시 레이지로딩 테스트 (ACTION1 권한)")
    void actionLazyLoadingPermit1() {
        Proxy proxy = new Proxy(Permit.ACTION1);
        assertEquals("프록시로 action1 메서드 대체", proxy.action1());
        assertEquals("action2 의 실행 권한이 없습니다.", proxy.action2());
    }

    @Test
    @DisplayName("프록시 레이지로딩 테스트 (ACTION2 권한)")
    void actionLazyLoadingPermit2() {
        Proxy proxy = new Proxy(Permit.ACTION2);
        assertEquals("프록시로 action1 메서드 대체", proxy.action1());
        assertEquals("RealSubject: action2", proxy.action2());
    }

    @Test
    @DisplayName("프록시의 action1 카운트 수 구하기")
    void actionProxyCount() {
        Proxy proxy = new Proxy(Permit.ACTION1);
        proxy.action1();
        proxy.action1();
        proxy.action1();
        proxy.action1();
        assertEquals(4, proxy.getAction1Count());
    }
}