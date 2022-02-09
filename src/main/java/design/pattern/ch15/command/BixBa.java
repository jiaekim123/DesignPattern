package design.pattern.ch15.command;

/**
 * ConcreteCommand 역할을 수행하는 BixBa 클래스
 */
public class BixBa {
    private Music music;

    public BixBa(Music defaultMusic) {
        this.music = defaultMusic;
    }

    public void talk(CommandType commandType) {
        switch (commandType) {
            case COMMAND_MUSIC_ON:
                music.musicOn();
                break;
            case COMMAND_MUSIC_OFF:
                music.musicOff();
                break;
            default:
                System.out.println("빅스바는 잘 모르는 내용이에요. 다시 한번 말해주세요.");
        }
    }
}
