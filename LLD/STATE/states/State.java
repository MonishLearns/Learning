package LLD.STATE.states;

import java.util.List;

import LLD.STATE.*;

public abstract class State {

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception();
    }

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception();
    }

    public void insertCoin(VendingMachine machine , Coin coin) throws Exception{
        throw new Exception();
    }

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception
    {
        throw new Exception();
    }

    public int getChange(int returnChangeMoney) throws Exception{
        throw new Exception();
    }

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception();
    }   

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        throw new Exception();
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception{
        throw new Exception();
    }


}

