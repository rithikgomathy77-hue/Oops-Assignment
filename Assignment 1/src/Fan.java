public class Fan extends SmartDevice {
    private int speed;

    public Fan(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        status = true;
        System.out.println(name + " Fan ON at speed " + speed);
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println(name + " Fan OFF");
    }
}