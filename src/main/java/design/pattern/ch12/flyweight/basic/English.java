package design.pattern.ch12.flyweight.basic;

public class English {
    private Hello hello;

    public English(Hello hello) {
        this.hello = hello;
    }

    public String hello() {
        return hello.browse("hello");
    }
}
