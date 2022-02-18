package design.pattern.ch19.mediator.basic;

public class ConcreteColleague3 extends Colleague {
    public ConcreteColleague3(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("Admin can't receive messages");
    }
}
