package Pattern9;

public abstract class CaffineBeverge {
    final public void prepareRecipe(){
        boilWater();
        brew();
        pourIntoCup();
        addCondiments();
    }

    protected void pourIntoCup(){
        System.out.println("Pour into cup");
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    protected void boilWater(){
        System.out.println("Boiling water");
    }
}
