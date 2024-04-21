package LLD.COMMAND;

import LLD.COMMAND.command.TurnOnAC;
import LLD.COMMAND.invoker.Remote;

public class Main {
    public static void main(String args[]){
        Remote remote = new Remote();

        remote.setCommand(new TurnOnAC());
        remote.press();
        remote.undo();
    }
}
