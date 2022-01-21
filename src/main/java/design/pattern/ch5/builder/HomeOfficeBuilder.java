package design.pattern.ch5.builder;

public class HomeOfficeBuilder extends Builder{
    @Override
    public void buildWorkspace() {
        office.setWorkspace("스윗 마이 홈");
    }

    @Override
    public void buildPc() {
        office.setPc("맥북");
    }

    @Override
    public void buildKeyboard() {
        office.setKeyboard("키크론 K8");
    }

    @Override
    public void buildMouse() {
        office.setMouse("로지텍 MX Master");
    }

    @Override
    public void buildWorker() {
        office.setWorker("노예");
    }

    @Override
    public void buildMonitor() {
        office.setMonitor("빈티나는 모니터 두개");
    }

    @Override
    public Office getOffice() {
        return office;
    }
}
