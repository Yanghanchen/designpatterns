package Pattern9;

public class Tea extends CaffineBeverge {
    @Override
    protected void addCondiments() {
        System.out.println("Add lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
