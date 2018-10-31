package Pattern11;

import java.util.ArrayList;

public class DessertMenu extends MenuCompnent {
    ArrayList<MenuCompnent> dessertList;

    public DessertMenu(ArrayList<MenuCompnent> dessertList) {
        this.dessertList = dessertList;
    }

    @Override
    public void add(MenuCompnent menuCompnent) {
        dessertList.add(menuCompnent);
    }

    @Override
    public void remove(MenuCompnent menuCompnent) {
        dessertList.remove(menuCompnent);
    }

    @Override
    public MenuCompnent getChild(int i) {
        return dessertList.get(i);
    }

    @Override
    public String getName() {
        return "——————————————Dessert Menu—————————————";
    }

    @Override
    public String getDescription() {
        return "This is a Menu of dessert";
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
        for(int i=0;i<dessertList.size();i++){
            System.out.print("[Dessert"+i+"] ");
            dessertList.get(i).print();
        }
    }
}
