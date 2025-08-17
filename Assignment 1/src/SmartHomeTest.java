public class SmartHomeTest {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[3];

        devices[0] = new Light("Living Room", 75);
        devices[1] = new Fan("Bedroom", 3);
        devices[2] = new Thermostat("Hall", 24);

        for (SmartDevice d : devices) {
            d.turnOn();
            d.getStatus();
        }

        SmartDevice.showDeviceCount();

        for (SmartDevice d : devices) {
            d.turnOff();
            d.getStatus();
        }

        for (SmartDevice d : devices) {
            d.disconnect();
        }

        SmartDevice.showDeviceCount();
    }
}