package Pattern21;

public class Client {
    public static void main(String[] args){
        MasterGameObject mgo = new MasterGameObject("test",0);
        mgo.missionCompleted();
        mgo.missionCompleted();
        mgo.missionCompleted();
        mgo.saveState();
        mgo.missionCompleted();
        mgo.missionCompleted();
        mgo.missionCompleted();
        mgo.missionFailed();
        System.out.println("当前在第"+mgo.getMission()+"关");
    }
}
