package put.io.patterns.implement;

public class MonitorRunner {

    public static void main(String args[]){
        SystemMonitor monitor = new SystemMonitor();

        SystemStateObserver infObserver = new SystemInfoObserver();
        SystemGarbageCollecorObserver garbObserver = new SystemGarbageCollecorObserver();
        SystemCoolerObserver coolObserver = new SystemCoolerObserver();
        USBDeviceObserver usbObserver = new USBDeviceObserver();
        monitor.addSystemStateObserver(infObserver);
        monitor.addSystemStateObserver(garbObserver);
        monitor.addSystemStateObserver(coolObserver);
        monitor.addSystemStateObserver(usbObserver);

        while (true) {

            monitor.probe();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
