package Pattern1;

public class DuckCaller {
    QuackBehavior quackBehavior;

    public DuckCaller(){
        quackBehavior=new Quack();
    }

    public DuckCaller(QuackBehavior quackType){
        this.quackBehavior=quackType;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setNewQuack(QuackBehavior quackType){
        this.quackBehavior=quackType;
    }
}
