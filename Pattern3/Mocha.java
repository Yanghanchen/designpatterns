package Pattern3;

public class Mocha extends Condiment {
    Beverge beverge;

    public Mocha(Beverge beverge){
        this.beverge=beverge;
    }

    @Override
    public String getDescription() {
        return beverge.getDescription()+" with Mocha";
    }

    @Override
    public double cost() {
        return beverge.cost()+0.2;
    }
}
