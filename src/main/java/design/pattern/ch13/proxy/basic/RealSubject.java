package design.pattern.ch13.proxy.basic;

public class RealSubject implements Subject {

    public RealSubject() {
        System.out.println(this.getClass().getName() + " 객체 생성");
    }

    public String action1() {

        System.out.println(this.getClass().getName() + ": action1");
        return (this.getClass().getSimpleName() + ": action1");
    }

    public String action2() {
        System.out.println(this.getClass().getName() + ": action2");
        return (this.getClass().getSimpleName() + ": action2");
    }

    @Override
    public boolean isProxy() {
        return false;
    }
}
