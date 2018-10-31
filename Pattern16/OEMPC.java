package Pattern16;

public class OEMPC extends PCBuilder {

    @Override
    public void buildCPU(String CPU) {
        pc.setCPU(CPU);
    }

    @Override
    public void buildRAM(String RAM) {
        pc.setRAM(RAM);
    }

    @Override
    public void buildHDD(String HDD) {
        pc.setHDD(HDD);
    }

    @Override
    public void buildGPU(String GPU) {
        pc.setGPU(GPU);
    }
}
