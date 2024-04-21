package LLD.COMMAND.invoker;

import java.util.Stack;

import LLD.COMMAND.command.Command;

public class Remote {
    Command command;
    Stack<Command> st = new Stack<>();

    public Remote() {

    }

    public void setCommand(Command com){
        command = com;
    }

    public void press() {
        command.execute();
        st.add(command);
    }

    public void undo() {
        if(!st.isEmpty()){
            Command command = st.pop();
            command.undo();
        }
    }
}
