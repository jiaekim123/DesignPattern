package design.pattern.ch19.mediator.basic;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagueList;

    public ConcreteMediator() {
        this.colleagueList = new ArrayList<>();
    }

    public ConcreteMediator(List<Colleague> colleagueList) {
        this.colleagueList = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        for (Colleague receiverColleague : colleagueList) {
            System.out.println("\t[Mediating " + colleague.getName() + " to " + receiverColleague.getName() + "]");
            receiverColleague.receive(colleague);
        }
    }
}
