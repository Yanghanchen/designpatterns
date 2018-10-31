package Pattern14;

public interface DuckObservable {
    void registry(Observer observer);
    void notifyObserver();
}
