package Pattern5;


public class Singleton {
    private volatile static Singleton singleton;

    public static Singleton getSingleton() {
        if(singleton==null) {
            synchronized (Singleton.class) {
                if(singleton==null) {
                    singleton = new Singleton();
                    System.out.println("Creating a singleton");
                }
            }
        }else{
            System.out.println("You have already created a instance");
        }
        return singleton;
    }

    private class SingletonHandler{
        private Singleton singleton=new Singleton();
    }
}
