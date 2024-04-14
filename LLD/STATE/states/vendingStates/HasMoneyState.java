package LLD.STATE.states.vendingStates;

import LLD.STATE.Coin;
import LLD.STATE.VendingMachine;
import LLD.STATE.states.State;

public class HasMoneyState extends State {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }

}
