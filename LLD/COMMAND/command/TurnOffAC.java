package LLD.COMMAND.command;

import LLD.COMMAND.receiver.AC;

public class TurnOffAC implements Command {
    AC ac;

    public void execute() {
        ac.turnOffAC();
    }

    public void undo() {
        ac.turnOnAC();
    }
}
    
