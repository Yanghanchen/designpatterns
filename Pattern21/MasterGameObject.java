package Pattern21;

public class MasterGameObject {
    private String name;
    private int mission;

    public MasterGameObject(String name,int mission) {
        this.name = name;
        this.mission = mission;
    }

    public String getName() {
        return name;
    }

    public int getMission() {
        return mission;
    }

    public void restoreState(){
        this.mission = GameMemento.getSavedGame(this);
    }

    public void missionFailed(){
        System.out.println("You failed in "+getMission()+"th mission");
        restoreState();
    }

    public void missionCompleted(){
        this.setMission(getMission()+1);
        System.out.println("当前已通过第"+getMission()+"关");
    }

    public void saveState(){
        GameMemento.saveGame(this);
    }

    public void setMission(int mission) {
        this.mission = mission;
    }
}
