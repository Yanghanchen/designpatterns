package Pattern6;

import java.util.ArrayList;

public class MacroCommands implements Command{
    ArrayList<Command> commands;

    public MacroCommands(){
        commands=new ArrayList<>();
    }

    public void setCommands(int slot,Command command){
        commands.add(slot,command);
    }

    @Override
    public void execute() {
        for(int i=0;i<commands.size();i++){
            commands.get(i).execute();
        }
    }

    @Override
    public void undo() {
        for(int i=0;i<commands.size();i++){
            commands.get(i).undo();
        }
    }
}
