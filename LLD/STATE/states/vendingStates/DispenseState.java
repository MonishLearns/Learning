package LLD.STATE.states.vendingStates;

import java.util.List;

import LLD.STATE.Coin;
import LLD.STATE.Item;
import LLD.STATE.VendingMachine;
import LLD.STATE.states.State;

public class DispenseState extends State {
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        machine.setState(new IdleState());
        for(Item item: machine.getInventory()){
            if(item.codeNumber == codeNumber){
                return item;
            }
        }
        return null;
    }

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setState(new IdleState());
        return machine.getCoinList();
    }
}
