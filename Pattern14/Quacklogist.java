package Pattern14;

public class Quacklogist implements Observer {
    @Override
    public void update(DuckObservable duck) {
        System.out.println("Quacklogist:"+duck+" just quacked.");
    }
}
