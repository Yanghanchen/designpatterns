package Pattern16;

public class Director {
    private PCBuilder builder;

    public Director(PCBuilder builder) {
        this.builder = builder;
    }

    public void create(String CPU,String RAM,String HDD,String GPU){
        builder.buildCPU(CPU);
        builder.buildRAM(RAM);
        builder.buildHDD(HDD);
        builder.buildGPU(GPU);
        builder.getPC().show();
    }
}
