package Pattern15;

public class RCA implements TV{
    int ON=0;
    int OFF=1;

    private int state=OFF;

    public RCA() {
        state = OFF;
    }

    @Override
    public void on() {
        System.out.println("RCA is on.");
        state=ON;
    }

    @Override
    public void off() {
        System.out.println("RCA is off.");
        state=OFF;
    }

    @Override
    public void tuneChannel(Channel channel) {
        if(state==ON)
            System.out.println("Now turn to "+channel.getName());
        else
            System.out.println("The TV is off!You can't change channel.");
    }

    public int getState() {
        return state;
    }
}
