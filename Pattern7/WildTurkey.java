package Pattern7;

public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I can fly a short distance");
    }
}
