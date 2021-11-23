package put.io.patterns.implement;

public class SystemGarbageCollecorObserver implements SystemStateObserver {
    SystemState actualState;

    public void update(SystemState newState) {
        actualState = newState;
        probe();
    }

    public void probe(){
        // Run garbage collector when out of memory
        if (actualState.getAvailableMemory() < 200.00){
            System.out.println("> Running garbage collector...");
        }
    }
}
