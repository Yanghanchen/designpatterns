package Pattern14;

public class GreenHeadDuck implements Quackable {
    Observable observable;

    public GreenHeadDuck() {
        observable=new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Qu~Qu~");
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
