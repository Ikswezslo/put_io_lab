package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver {
    SystemState actualState;
    int number_of_devices = -1;

    public void update(SystemState newState) {
        actualState = newState;
        probe();
    }

    public void probe(){
        if(number_of_devices != actualState.getUsbDevices() && number_of_devices != -1) {
            System.out.println(String.format("Zmieniono liczbe USB, teraz: %d", actualState.getUsbDevices()));
        }
        number_of_devices = actualState.getUsbDevices();

    }
}
