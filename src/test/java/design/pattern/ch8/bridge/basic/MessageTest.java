package design.pattern.ch8.bridge.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MessageTest {
    @Test
    @DisplayName("한국말인사")
    void testLanguageKorea() {
        Message message = new Message(new Korean());
        System.out.println(message.greeting());
        Assertions.assertEquals("안녕하세요.", message.greeting());
    }

    @Test
    @DisplayName("영어")
    void testLanguageEnglish() {
        Message message = new Message(new English());
        System.out.println(message.greeting());
        Assertions.assertEquals("hello", message.greeting());
    }

}