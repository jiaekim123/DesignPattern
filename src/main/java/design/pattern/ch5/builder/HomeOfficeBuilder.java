package design.pattern.ch5.builder;

public class HomeOfficeBuilder extends Builder{
    @Override
    public Builder buildWorkspace() {
        office.setWorkspace("스윗 마이 홈");
        return this;
    }

    @Override
    public Builder buildPc() {
        office.setPc("맥북");
        return this;
    }

    @Override
    public Builder buildKeyboard() {
        office.setKeyboard("키크론 K8");
        return this;
    }

    @Override
    public Builder buildMouse() {
        office.setMouse("로지텍 MX Master");
        return this;
    }

    @Override
    public Builder buildWorker() {
        office.setWorker("노예");
        return this;
    }

    @Override
    public Builder buildMonitor() {
        office.setMonitor("빈티나는 모니터 두개");
        return this;
    }

    @Override
    public Office getOffice() {
        return office;
    }
}
