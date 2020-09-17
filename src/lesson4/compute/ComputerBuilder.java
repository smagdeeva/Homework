package lesson4.compute;

public class ComputerBuilder {
    private String processClass;
    private String ram;
    private String videoAdapter;
    private String hdd;
    private String monitor;


    public ComputerBuilder withProcessClass(String processClass, String coreSpeed, String Core, String cacheMemory, String name, String brand) {
        this.processClass = processClass;
        return this;
    }

    public ComputerBuilder withRam(String ram, String brand, String memory, String typeMemory) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder withVideoAdapter(String videoAdapter, String brand, String typeMemory, String memory, boolean colling) {
        this.videoAdapter = videoAdapter;
        return this;
    }

    public ComputerBuilder withHdd(String hdd, String brand, String memory, String typeHdd, String formFactor) {
        this.hdd = hdd;
        return this;
    }

    public ComputerBuilder withMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    public Computer build() {

        return new Computer(processClass, ram, videoAdapter, hdd, monitor);
    }
}