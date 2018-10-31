package Pattern7;

import Pattern1.Duck;

public class TurkeyAdapter extends Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }

    @Override
    public void display() {
        System.out.println("This is a "+turkey.getClass().getSimpleName());
    }

    @Override
    public void performFly() {
        turkey.fly();
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }
}
