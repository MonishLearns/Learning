package LLD.STATE;

import java.util.List;

import LLD.STATE.states.State;
import LLD.STATE.states.vendingStates.IdleState;

public class VendingMachine {
    public State currentState;
    private List<Item> inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        this.currentState = new IdleState();
    }

    public void setState(State state){
        this.currentState = state;
    }

    public List<Item> getInventory(){
        return this.inventory;
    }

    public State getState(){
        return this.currentState;
    }

    public void addItem(Item item){
        this.inventory.add(item);
    }

    public void removeItem(int codeNumber) throws Exception{
        for(Item item1 : inventory){
            if(item1.codeNumber == codeNumber){
                int currentQuantity = item1.getQuantity();
                if(currentQuantity > 0){
                    item1.setQuantity(currentQuantity-1);
                    if(currentQuantity==1){
                        item1.setSoldOut(true);
                    }
                }
                else{
                    throw new Exception("No items present");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {

        for (Item itemShelf : inventory) {
            if (itemShelf.codeNumber == codeNumber) {
                if (itemShelf.getSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return itemShelf;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public List<Coin> getCoinList() {
        return this.coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

}
