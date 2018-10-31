package Pattern10;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakehouseMenu {
    ArrayList<MenuItem> menulist;

    public PancakehouseMenu(){
        menulist=new ArrayList<>();
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        menulist.add(new MenuItem(name, description, vegetarian, price));
    }

    public ArrayList<MenuItem> getMenulist() {
        return menulist;
    }

    public PancakehouseMenuIterator iterator(){
        return new PancakehouseMenuIterator();
    }

    private class PancakehouseMenuIterator implements Iterator<MenuItem> {
        int position=0;

        @Override
        public boolean hasNext() {
            if(menulist.size()<=position)
                return false;
            else
                return true;
        }

        @Override
        public MenuItem next() {
            return menulist.get(position++);
        }
    }
}
