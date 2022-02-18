package design.pattern.ch19.mediator.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MediatorTest {
    @Test
    @DisplayName("Mediator 테스트")
    void mediatorTest() {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague1("User1");
        Colleague colleague2 = new ConcreteColleague1("User2");
        Colleague colleague3 = new ConcreteColleague2("System");
        Colleague colleague4 = new ConcreteColleague3("Admin");

        colleague1.setMediator(mediator);
        colleague2.setMediator(mediator);
        colleague3.setMediator(mediator);
        colleague4.setMediator(mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);
        mediator.addColleague(colleague3);
        mediator.addColleague(colleague4);

        colleague1.setMessage("I am user1");
        colleague1.send();
    }

}