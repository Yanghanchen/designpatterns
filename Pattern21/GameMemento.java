package Pattern21;

import java.util.HashMap;
import java.util.Map;

public class GameMemento {
    private static Map<String,Integer> savedGameState=new HashMap<>();

    public static void saveGame(MasterGameObject mgo){
        savedGameState.put(mgo.getName(),mgo.getMission());
    }

    public static int getSavedGame(MasterGameObject mgo){
        return savedGameState.get(mgo.getName());
    }
}
