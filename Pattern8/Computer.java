package Pattern8;

public class Computer {
    private CPU cpu;
    private Disk disk;
    private Monitor monitor;

    public Computer() {
        cpu=new CPU();
        disk=new Disk();
        monitor=new Monitor();
    }

    public void on(){
        cpu.on();
        disk.on();
        monitor.on();
    }

    public void off(){
        cpu.off();
        disk.off();
        monitor.off();
    }
}
