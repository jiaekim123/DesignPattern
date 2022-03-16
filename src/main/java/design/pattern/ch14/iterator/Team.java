package design.pattern.ch14.iterator;

import java.util.Iterator;

public class Team implements Aggregate<Worker> {
    private final Worker[] workers;
    private final String name;
    private int lastIndex = 0;

    public Team(String name, int size) {
        this.name = name;
        workers = new Worker[size];
    }

    public void addTeamMember(Worker worker) {
        if (lastIndex < workers.length) {
            this.workers[lastIndex] = worker;
            lastIndex++;
        } else {
            System.out.println("팀의 정원이 꽉 찼습니다.");
        }
    }


    public Worker getWorker(int index) {
        return workers[index];
    }

    public int getSize() {
        return workers.length;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<Worker> iterator() {
        return new TeamIterator(this);
    }

}
