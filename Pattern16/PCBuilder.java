package Pattern16;

public abstract class PCBuilder {
    protected PC pc=new PC();

    public abstract void buildCPU(String CPU);
    public abstract void buildRAM(String RAM);
    public abstract void buildHDD(String HDD);
    public abstract void buildGPU(String GPU);

    public PC getPC(){
        return pc;
    }
}
