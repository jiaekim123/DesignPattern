package design.pattern.ch8.bridge.school;

public class Teacher {
    private TeacherAction teacherAction;

    public Teacher(TeacherAction teacherAction) {
        this.teacherAction = teacherAction;
    }

    public void teach() {
        teacherAction.hello();
        teacherAction.educate();
        teacherAction.homework();
    }
}
