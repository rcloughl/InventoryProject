public class Item {
// this class creates the Items that the inventory class stores
    private ItemType type;
    private String itemName;
    private int itemWeight;
    private int itemValue;
    private int itemStrength;

    public Item(){
        type = null;
        itemName = "";
        itemWeight =0;
        itemValue=0;
        itemStrength=0;
    }

    public void setType(ItemType ti){
        this.type=ti;
    }

    public void setName(String nm){
        this.itemName=nm;
    }

    public void setWeight(int num){
        this.itemWeight=num;
    }

    public void setValue(int num){
        this.itemValue=num;
    }

    public void setStrength(int num){
        this.itemStrength=num;
    }

    public ItemType getType() {
        return this.type;
    }

    public String getName() {
        return this.itemName;
    }

    public int getWeight() {
        return this.itemWeight;
    }

    public int getValue() {
        return this.itemValue;
    }

    public int getStrength() {
        return this.itemStrength;
    }

}