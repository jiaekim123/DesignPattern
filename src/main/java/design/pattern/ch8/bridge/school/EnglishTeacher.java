package design.pattern.ch8.bridge.school;

public class EnglishTeacher implements TeacherAction {
    private static final String SUBJECT = "영어";

    @Override
    public void hello() {
        System.out.println("Hi~ Everyone~~");
    }

    @Override
    public void educate() {
        System.out.println(SUBJECT + " 과목 가르치기");
    }

    @Override
    public void homework() {
        System.out.println(SUBJECT + "책 읽어오기");
    }
}
