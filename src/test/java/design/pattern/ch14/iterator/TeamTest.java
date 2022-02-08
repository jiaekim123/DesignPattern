package design.pattern.ch14.iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

class TeamTest {

    @Test
    @DisplayName("팀 반복 테스트")
    void teamTest() {
        Team team = new Team("TF팀", 5);
        team.addTeamMember(new Worker("이모씨", WorkerType.MANAGER));
        team.addTeamMember(new Worker("김모씨", WorkerType.DEVELOPER));
        team.addTeamMember(new Worker("송모씨", WorkerType.DEVELOPER));
        team.addTeamMember(new Worker("임모씨", WorkerType.PLANNER));
        team.addTeamMember(new Worker("장모씨", WorkerType.QA));

        System.out.println("팀 이름: " + team.getName());

        Iterator<Worker> iterator = team.iterator();
        while (iterator.hasNext()) {
            Worker worker = iterator.next();
            System.out.println("-------------");
            System.out.println("이름: " + worker.getName());
            System.out.println("직업: " + worker.getType().getValue());
        }
    }

}