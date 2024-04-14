package LLD.STATE;


public class Item {
    private String type;
    public int codeNumber;
    private int quantity;
    private int price;
    private boolean soldOut;

    public Item(String type, int codeNumber, int quantity, int price){
        this.type = type;
        this.codeNumber = codeNumber;
        this.quantity = quantity;
        this.price = price;
        this.soldOut = false;
    }

    public  void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public  void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public  void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public  void setSoldOut(boolean soldOut){
        this.soldOut = soldOut;
    }

    public boolean getSoldOut(){
        return this.soldOut;
    }


}
