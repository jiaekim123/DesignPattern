package design.pattern.ch5.builder;

public abstract class Builder {
    protected Office office;

    public Builder createOffice(){
        office = new Office();
        return this;
    }

    public abstract Builder buildWorkspace();
    public abstract Builder buildPc();
    public abstract Builder buildKeyboard();
    public abstract Builder buildMouse();
    public abstract Builder buildWorker();
    public abstract Builder buildMonitor();

    public abstract Office getOffice();
}
