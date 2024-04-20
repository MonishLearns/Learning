package LLD.COMMAND.command;

import LLD.COMMAND.receiver.AC;

public class TurnOnAC implements Command {
    AC ac = new AC();

    public void execute() {
        ac.turnOnAC();
    }
}
    
