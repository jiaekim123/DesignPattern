package design.pattern.ch5.builder;

public abstract class Builder {
    protected Office office;

    public void createOffice(){
        office = new Office();
    }

    public abstract void buildWorkspace();
    public abstract void buildPc();
    public abstract void buildKeyboard();
    public abstract void buildMouse();
    public abstract void buildWorker();
    public abstract void buildMonitor();

    public abstract Office getOffice();
}
