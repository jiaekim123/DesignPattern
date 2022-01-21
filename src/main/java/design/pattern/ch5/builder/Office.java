package design.pattern.ch5.builder;

public class Office {
    private String workspace;
    private String pc;
    private String keyboard;
    private String mouse;
    private String worker;
    private String monitor;

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }


    @Override
    public String toString() {
        return  worker + "는 오늘도 " + workspace + "에서 " +
                 pc + "과 " + keyboard + "과 " + mouse + "으로 " +
                monitor + "을 보며 열일 중이다.";
    }
}
