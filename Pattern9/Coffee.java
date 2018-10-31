package Pattern9;

public class Coffee extends CaffineBeverge {
    @Override
    protected void addCondiments() {
        System.out.println("Add sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
