package Pattern11;

public class MenuItem extends MenuCompnent {
    String name;
    String description;
    double price;
    boolean vegeterian;

    public MenuItem(String name, String description, double price, boolean vegeterian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegeterian = vegeterian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegeterian() {
        return vegeterian;
    }

    @Override
    public void print() {
        System.out.println(name+","+description+",$"+price);
    }
}
