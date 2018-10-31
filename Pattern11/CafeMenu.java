package Pattern11;

import java.util.ArrayList;

public class CafeMenu extends MenuCompnent{
    ArrayList<MenuCompnent> cafeMenu;

    public CafeMenu(ArrayList<MenuCompnent> cafeMenu) {
        this.cafeMenu = cafeMenu;
    }

    @Override
    public void add(MenuCompnent menuCompnent) {
        cafeMenu.add(menuCompnent);
    }

    @Override
    public void remove(MenuCompnent menuCompnent) {
        cafeMenu.remove(menuCompnent);
    }

    @Override
    public MenuCompnent getChild(int i) {
        return cafeMenu.get(i);
    }

    @Override
    public String getName() {
        return "——————————————Welcome to Cafe——————————————";
    }

    @Override
    public String getDescription() {
        return "This is Cafe's menu";
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public boolean isVegeterian() {
        return super.isVegeterian();
    }

    @Override
    public void print() {
        System.out.println(getName());
        for(int i=0;i<cafeMenu.size();i++){
            cafeMenu.get(i).print();
        }
    }
}
