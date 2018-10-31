package Pattern10;

import java.util.Iterator;

public class DinerMenu {
    MenuItem[] menuItems;
    int numOfItems=0;

    public DinerMenu(int items){
        menuItems=new MenuItem[items];
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        if(menuItems.length>numOfItems){
            menuItems[numOfItems]=new MenuItem(name, description, vegetarian, price);
            numOfItems++;
        }else{
            System.out.println("Oops!The Menu is already full!");
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public DinerMenuIterator iterator(){
        return new DinerMenuIterator();
    }

    public class DinerMenuIterator implements Iterator<MenuItem> {
        int position=0;

        @Override
        public boolean hasNext() {
            if(position>=menuItems.length)
                return false;
            else
                return true;
        }

        @Override
        public MenuItem next() {
            return menuItems[position++];
        }
    }
}
