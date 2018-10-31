package Pattern14;

public class DuckSimulator {
    public void simulate(Quackable duck){
        Quacklogist quacklogist=new Quacklogist();
        duck.registry(quacklogist);
        duck.quack();
    }
}
