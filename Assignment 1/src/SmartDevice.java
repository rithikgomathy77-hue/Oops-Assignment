public abstract class SmartDevice {
    protected String name;
    protected boolean status;
    private static int deviceCount = 0;

    public SmartDevice(String name) {
        this.name = name;
        this.status = false;
        deviceCount++;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public void getStatus() {
        System.out.println(name + " is " + (status ? "ON" : "OFF"));
    }

    public static void showDeviceCount() {
        System.out.println("Total devices: " + deviceCount);
    }

    public void disconnect() {
        if (deviceCount > 0) {
            deviceCount--;
            System.out.println(name + " disconnected.");
        }
    }
}