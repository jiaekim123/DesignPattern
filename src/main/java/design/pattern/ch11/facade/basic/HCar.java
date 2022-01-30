package design.pattern.ch11.facade.basic;

public class HCar implements Car {
    // 클래스의 구성 요소
    // 구성 요소의 메서드는 호출해도 된다.
    private Engine engine;
    private String name;
    private Doors doors;

    public HCar(Engine engine, String key) {
        this.engine = engine;
        this.name = "현대 자동차";
        this.doors = new HDoors(new CarKey(key));

    }

    @Override
    public void open(String key) {
        doors.unlocks(key);
    }

    @Override
    public void drive(String key) {

        boolean authorized = this.doors.getKey().turns(key);

        if (authorized) {
            engine.start();

            this.updateDashboardDisplay();

            doors.locks(key);
        } else {
            throw new CarKeyNotMatchException();
        }
    }

    @Override
    public void stop() {
        engine.stop();
        this.updateDashboardDisplay();
    }

    private void updateDashboardDisplay() {
        System.out.println(getName() + " " + engine.status().getDisplayName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
