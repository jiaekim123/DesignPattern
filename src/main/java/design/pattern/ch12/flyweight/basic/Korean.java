package design.pattern.ch12.flyweight.basic;

public class Korean {
    private Hello hello;

    public Korean(Hello hello) {
        this.hello = hello;
    }

    public String hello() {
        return hello.console("안녕하세요");
    }
}
