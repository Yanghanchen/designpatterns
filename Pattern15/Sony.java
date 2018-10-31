package Pattern15;

public class Sony implements TV {
    int ON=0;
    int OFF=1;

    private int state=OFF;

    public Sony() {
        state = OFF;
    }

    @Override
    public void on() {
        System.out.println("Sony is on.");
        state=ON;
    }

    @Override
    public void off() {
        System.out.println("Sony is off.");
        state=OFF;
    }

    public int getState() {
        return state;
    }

    @Override
    public void tuneChannel(Channel channel) {
        if(state==ON)
            System.out.println("Now turn to "+channel.getName());
        else
            System.out.println("The TV is off!You can't change channel.");
    }
}
