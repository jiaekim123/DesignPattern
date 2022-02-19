package design.pattern.ch19.mediator.basic;

public class SystemConcreteColleague extends Colleague {
    public SystemConcreteColleague(String name) {
        super(name, ColleagueType.SYSTEM);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("System can't receive messages");
    }
}
