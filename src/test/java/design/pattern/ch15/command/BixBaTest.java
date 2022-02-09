package design.pattern.ch15.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BixBaTest {

    @Test
    @DisplayName("빅스바 음악 플라")
    void musicFlaTest() {
        BixBa bixBa = new BixBa(new Fla());
        bixBa.talk(CommandType.COMMAND_MUSIC_ON);
        bixBa.talk(CommandType.COMMAND_MUSIC_OFF);
    }

    @Test
    @DisplayName("빅스바 음악 우투브")
    void musicUtubeTest() {
        BixBa bixBa = new BixBa(new Utube());
        bixBa.talk(CommandType.COMMAND_MUSIC_ON);
        bixBa.talk(CommandType.COMMAND_MUSIC_OFF);
    }
}