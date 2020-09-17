package lesson4.compute;

public class Computer {
    private String processClass;
    private String ram;
    private String videoAdapter;
    private String hdd;
    private String monitor;


    public Computer(String processClass, String ram, String videoAdapter, String hdd, String monitor) {
        this.processClass = processClass;
        this.ram = ram;
        this.videoAdapter = videoAdapter;
        this.hdd = hdd;
        this.monitor = monitor;
    }
}