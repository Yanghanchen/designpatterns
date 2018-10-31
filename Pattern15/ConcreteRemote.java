package Pattern15;

public class ConcreteRemote extends RemoteControl{

    public ConcreteRemote(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }

    @Override
    public void setChannel(Channel channel) {
        super.setChannel(channel);
    }
}
