package design.pattern.ch5.builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.createOffice()
                .buildWorker()
                .buildPc()
                .buildMonitor()
                .buildMouse()
                .buildKeyboard()
                .buildWorkspace();
    }

    public Office getOffice(){
        return builder.getOffice();
    }
}
