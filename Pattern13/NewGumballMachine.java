package Pattern13;

import Pattern12.GumballMachine;

public class NewGumballMachine extends GumballMachine{
    String location;

    public NewGumballMachine(String location,int count) {
        super(count);
        this.location=location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public int getCount(){
        return super.getCount();
    }

    @Override
    public int getState() {
        return super.getState();
    }

    public void report(){
        System.out.println("Machine at:"+getLocation());
        System.out.println("Machine state:"+getState());
        System.out.println("Gumballs left:"+getCount());
    }
}
