package Pattern4;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings=new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing: "+name);
        System.out.println("Tossing dough: "+dough);
        System.out.println("Adding sauce: "+sauce);
        System.out.println("Adding toppings");
        for(int i=0;i<toppings.size();i++){
            System.out.println(" "+toppings.get(i));
        }
    }

    public void bake(){
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut(){
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Placing pizza in official Pizzastore box");
    }

    public String getName() {
        return name;
    }
}
