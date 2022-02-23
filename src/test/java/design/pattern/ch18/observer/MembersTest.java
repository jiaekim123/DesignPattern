package design.pattern.ch18.observer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MembersTest {

    @Test
    @DisplayName("감시자 패턴 테스트")
    void observerTest() {
        Subject subject = new Members();
        Observer observer1 = new UserA("jiae");
        Observer observer2 = new UserA("nova");
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        
        subject.notifyObserver();
    }
}