package Pattern18;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeManager {
    ArrayList<int[]> locations;

    public TreeManager(ArrayList<int[]> locations) {
        this.locations = locations;
    }

    public void display(){
        Iterator<int[]> it=locations.iterator();
        while(it.hasNext()){
            int[] a=it.next();
            Tree.display(a[0],a[1],a[2]);
        }
    }
}
