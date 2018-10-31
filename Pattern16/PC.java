package Pattern16;

public class PC {
    private String CPU;
    private String HDD;
    private String RAM;
    private String GPU;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void show(){
        System.out.println("This is a PC with:"+CPU+","+RAM+","+HDD+","+GPU);
    }
}
