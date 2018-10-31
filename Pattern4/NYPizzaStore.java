package Pattern4;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new NYPizza(type);
    }
}
