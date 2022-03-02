package design.pattern.ch5.builder;

public class CompanyOfficeBuilder extends Builder{
    @Override
    public Builder buildWorkspace() {
        office.setWorkspace("회사");
        return this;
    }

    @Override
    public Builder buildPc() {
        office.setPc("맥북");
        return this;
    }

    @Override
    public Builder buildKeyboard() {
        office.setKeyboard("맥북 키보드");
        return this;
    }

    @Override
    public Builder buildMouse() {
        office.setMouse("맥북 터치패드");
        return this;
    }

    @Override
    public Builder buildWorker() {
        office.setWorker("직원");
        return this;
    }

    @Override
    public Builder buildMonitor() {
        office.setMonitor("깐지나는 모니터 하나");
        return this;
    }

    @Override
    public Office getOffice() {
        return office;
    }
}
