package Pattern4;

public class NYPizza extends Pizza {

    public NYPizza(String type){
        name="NY "+type+" Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";
        toppings.add("Granted Regiano cheese");
    }

    @Override
    public void prepare() {
        super.prepare();
    }

    @Override
    public void bake() {
        super.bake();
    }

    @Override
    public void cut() {
        super.cut();
    }

    @Override
    public void box() {
        super.box();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
