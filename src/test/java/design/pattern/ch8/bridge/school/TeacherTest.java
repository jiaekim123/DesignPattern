package design.pattern.ch8.bridge.school;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TeacherTest {
    @Test
    @DisplayName("영어")
    void english() {
        Teacher teacher = new Teacher(new EnglishTeacher());
        teacher.teach();
    }

    @Test
    @DisplayName("컴퓨터")
    void computer() {
        Teacher teacher = new Teacher(new ComputerTeacher());
        teacher.teach();
    }

}