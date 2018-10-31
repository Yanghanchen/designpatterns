package Pattern6;

import java.util.ArrayList;

public class RemoteController {
    ArrayList<Command> Commands;
    ArrayList<Command> undoCommands;

    public RemoteController(){
        Commands=new ArrayList<>();
        undoCommands=new ArrayList<>();
    }

    public void setCommands(int slot,Command command){
        Commands.add(slot,command);
    }

    public void buttonPushed(int slot){
        try {
            Commands.get(slot).execute();
            undoCommands.add(slot,Commands.get(slot));
        }catch (Exception e) {
            System.out.println("No such command");
        }
    }

    public void buttonUnPush(int slot){
        try {
            undoCommands.get(slot).undo();
        }catch (Exception e) {
            System.out.println("This slot hasn't been pushed before");
        }
    }

    public String toString(){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("\n———————————————————Remote Controller———————————————————\n");
        for(int i=0;i<Commands.size();i++){
            stringBuffer.append("[slot"+i+"] "+Commands.get(i).getClass().getSimpleName()+"\n");
        }
        return stringBuffer.toString();
    }
}
