package design.pattern.ch19.mediator.basic;

public interface Mediator {

    void addColleague(Colleague colleague);

    void mediate(Colleague colleague);
}
