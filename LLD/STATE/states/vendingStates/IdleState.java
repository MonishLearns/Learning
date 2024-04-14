package LLD.STATE.states.vendingStates;

import LLD.STATE.Item;
import LLD.STATE.VendingMachine;
import LLD.STATE.states.State;

public class IdleState extends State {
    public void clickOnInsertCoinButton(VendingMachine machine) {
        machine.setState(new HasMoneyState());
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception{
        machine.addItem(item);
    }

}
