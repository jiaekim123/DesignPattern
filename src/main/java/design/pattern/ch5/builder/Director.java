package design.pattern.ch5.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build(){
        builder.createOffice();
        builder.buildWorker();
        builder.buildPc();
        builder.buildMonitor();
        builder.buildMouse();
        builder.buildKeyboard();
        builder.buildWorkspace();
    }

    public Office getOffice(){
        return builder.getOffice();
    }
}
