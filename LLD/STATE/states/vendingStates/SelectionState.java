package LLD.STATE.states.vendingStates;

import java.util.List;

import LLD.STATE.Coin;
import LLD.STATE.Item;
import LLD.STATE.VendingMachine;
import LLD.STATE.states.State;

public class SelectionState extends State {
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        int paidByUser=0;
        for(Coin coin : machine.getCoinList()){
            paidByUser+=coin.value;
        }
        for(Item item: machine.getInventory()){
            if(item.codeNumber == codeNumber){
                if(item.getPrice() > paidByUser){
                    refundFullMoney(machine);
                    throw new Exception("insufficient money");
                }
                else{
                    // show how return change
                    machine.setState(new DispenseState());
                }

            }
        }
    }

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        machine.setState(new IdleState());
        return machine.getCoinList();

    }
}
