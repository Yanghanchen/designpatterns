package Pattern6;

public class Light {
    private int ON=0;
    private int OFF=1;
    private int state;

    public Light(){
        this.state=OFF;
    }

    public void on(){
        this.state=ON;
        System.out.println(toString());
    }

    public void off(){
        this.state=OFF;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Light is turned "+((state==0)?"On":"Off");
    }
}
