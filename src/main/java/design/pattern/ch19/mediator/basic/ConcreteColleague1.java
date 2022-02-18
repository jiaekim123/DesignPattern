package design.pattern.ch19.mediator.basic;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println(this.name + " received " + colleague.getName() + "'s Message : " + colleague.getMessage());
    }
}
