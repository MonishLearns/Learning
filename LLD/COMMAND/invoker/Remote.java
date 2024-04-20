package LLD.COMMAND.invoker;

import LLD.COMMAND.command.Command;

public class Remote {
    Command command;

    public Remote() {
        
    }

    public void setCommand(Command com){
        command = com;
    }

    public void press() {
        command.execute();
    }
}
