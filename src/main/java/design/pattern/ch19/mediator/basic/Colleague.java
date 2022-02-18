package design.pattern.ch19.mediator.basic;

public abstract class Colleague {
    private Mediator mediator;
    protected String name;
    private String message;


    public Colleague(String name) {
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public void send() {
        System.out.println(this.name + " send()");
        System.out.println();
        mediator.mediate(this);
    }

    public abstract void receive(Colleague colleague);

}
