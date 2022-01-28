package design.pattern.ch8.bridge.school;

public class ComputerTeacher implements TeacherAction {
    private final static String SUBJECT = "컴퓨터";

    @Override
    public void hello() {
        System.out.println("hello world");
    }

    @Override
    public void educate() {
        System.out.println(SUBJECT + " 과목 가르치기");
    }

    @Override
    public void homework() {
        System.out.println("팀 프로젝트 시키기");
    }
}
