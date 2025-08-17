public class Light extends SmartDevice {
    private int brightness;

    public Light(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        status = true;
        System.out.println(name + " Light ON with brightness " + brightness);
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println(name + " Light OFF");
    }
}