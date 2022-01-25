package design.pattern.ch8.bridge.basic;

public class Message extends Language {
    public Message(Hello hello) {
        this.hello = hello;
    }

    @Override
    public String greeting() {
        return hello.greeting();
    }
}
