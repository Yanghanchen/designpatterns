package Pattern14;

import java.util.ArrayList;

public class Observable implements DuckObservable {
    ArrayList<Observer> observers=new ArrayList();
    DuckObservable duck;

    public Observable(DuckObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registry(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(duck);
        }
    }
}
