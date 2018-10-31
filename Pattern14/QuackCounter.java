package Pattern14;

public class QuackCounter implements Quackable {
    Quackable duck;
    static private int count=0;
    Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable=new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        notifyObserver();
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void registry(Observer observer) {
        observable.registry(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
}
