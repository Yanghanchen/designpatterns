package Pattern15;

public class RemoteFactory {
    public static ConcreteRemote getSonyRemote(){
        return new ConcreteRemote(new Sony());
    }

    public static ConcreteRemote getRCARemote(){
        return new ConcreteRemote(new RCA());
    }
}
