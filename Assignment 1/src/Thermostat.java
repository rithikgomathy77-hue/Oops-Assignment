public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        status = true;
        System.out.println(name + " Thermostat ON at " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println(name + " Thermostat OFF");
    }
}