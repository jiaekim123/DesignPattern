package design.pattern.ch5.builder;

public class CompanyOfficeBuilder extends Builder{
    @Override
    public void buildWorkspace() {
        office.setWorkspace("회사");
    }

    @Override
    public void buildPc() {
        office.setPc("맥북");
    }

    @Override
    public void buildKeyboard() {
        office.setKeyboard("맥북 키보드");
    }

    @Override
    public void buildMouse() {
        office.setMouse("맥북 터치패드");
    }

    @Override
    public void buildWorker() {
        office.setWorker("직원");
    }

    @Override
    public void buildMonitor() {
        office.setMonitor("깐지나는 모니터 하나");
    }

    @Override
    public Office getOffice() {
        return office;
    }
}
