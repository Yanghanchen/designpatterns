package Pattern14;

public class RedHeadDuck implements Quackable {
    Observable observable;

    public RedHeadDuck() {
        observable=new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Q~Q~");
        notifyObserver();
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
