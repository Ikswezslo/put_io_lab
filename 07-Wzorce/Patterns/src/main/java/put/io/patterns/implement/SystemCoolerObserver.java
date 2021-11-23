package put.io.patterns.implement;

public class SystemCoolerObserver implements SystemStateObserver {
    SystemState actualState;

    public void update(SystemState newState) {
        actualState = newState;
        probe();
    }

    public void probe(){
        // Increase CPU cooling if the temperature is to high
        if (actualState.getCpuTemp() > 60.00){
            System.out.println("> Increasing cooling of the CPU...");
        }
    }
}
