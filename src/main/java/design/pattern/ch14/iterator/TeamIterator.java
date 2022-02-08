package design.pattern.ch14.iterator;

import java.util.Iterator;

public class TeamIterator implements Iterator<Worker> {
    private final Team team;
    private int index;

    public TeamIterator(Team team) {
        this.team = team;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < team.getSize();
    }

    @Override
    public Worker next() {
        Worker worker = team.getWorker(index);
        index++;
        return worker;
    }
}
