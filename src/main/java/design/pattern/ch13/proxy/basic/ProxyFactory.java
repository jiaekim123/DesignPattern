package design.pattern.ch13.proxy.basic;

public class ProxyFactory {
    public Subject getObject() {
        return new Proxy(new RealSubject());
    }
}
