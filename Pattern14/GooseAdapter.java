package Pattern14;

public class GooseAdapter implements Quackable {
    Observable observable;
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable=new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
