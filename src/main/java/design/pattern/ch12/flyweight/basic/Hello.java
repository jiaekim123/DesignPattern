package design.pattern.ch12.flyweight.basic;

public class Hello {

    private static Hello hello = null;

    private Hello() {
    }

    public static Hello getInstance() {
        if (hello != null) {
            return hello;
        }
        hello = new Hello();
        return hello;
    }

    public String console(String message) {
        return message + "\n";
    }

    public String browse(String message) {
        return message + "<br/>";
    }
}
