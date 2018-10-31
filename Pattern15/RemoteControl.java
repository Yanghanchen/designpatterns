package Pattern15;

public abstract class RemoteControl {
    TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void on(){
        tv.on();
    }
    public void off(){
        tv.off();
    }
    public void setChannel(Channel channel){
        tv.tuneChannel(channel);
    }
}
