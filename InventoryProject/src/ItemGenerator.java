import java.util.Random;
//this class is used to fill the inventory with items
public class ItemGenerator {

    public static int rand(int t){
        Random random = new Random();
        return random.nextInt(t);
    }

    public static Item generate(){
        Random random = new Random();
        Item newItem = new Item();
        int temp=rand(3);

        if(temp==0){
            newItem.setType(ItemType.Weapon);
        }
        else if(temp==1){
            newItem.setType(ItemType.Armor);
        }
        else if(temp==2){
            newItem.setType(ItemType.Miscellaneous);
        }

        if(newItem.getType()==ItemType.Weapon){
            temp=rand(5);
            if(temp==0){
                newItem.setName("Long Sword");
                newItem.setWeight(16);
                newItem.setValue(18);
                newItem.setStrength(23);
            }
            else if(temp==1){
                newItem.setName("Broad Sword");
                newItem.setWeight(21);
                newItem.setValue(22);
                newItem.setStrength(26);
            }
            else if(temp==2){
                newItem.setName("Short Sword");
                newItem.setWeight(12);
                newItem.setValue(13);
                newItem.setStrength(15);
            }
            else if(temp==3){
                newItem.setName("Dagger");
                newItem.setWeight(3);
                newItem.setValue(6);
                newItem.setStrength(8);
            }
            else if(temp==4){
                newItem.setName("Axe");
                newItem.setWeight(7);
                newItem.setValue(9);
                newItem.setStrength(13);
            }
        }
        else
        if(newItem.getType()==ItemType.Armor){
            temp=rand(5);
            if(temp==0){
                newItem.setName("Chest Plate");
                newItem.setWeight(19);
                newItem.setValue(22);
                newItem.setStrength(35);
            }
            else if(temp==1){
                newItem.setName("Chainmail");
                newItem.setWeight(21);
                newItem.setValue(22);
                newItem.setStrength(26);
            }
            else if(temp==2){
                newItem.setName("Helmet");
                newItem.setWeight(9);
                newItem.setValue(16);
                newItem.setStrength(17);
            }
            else if(temp==3){
                newItem.setName("Leggins");
                newItem.setWeight(16);
                newItem.setValue(12);
                newItem.setStrength(24);
            }
            else if(temp==4){
                newItem.setName("Shield");
                newItem.setWeight(7);
                newItem.setValue(9);
                newItem.setStrength(23);
            }
        }
        else
        if(newItem.getType()==ItemType.Miscellaneous){
            temp=rand(5);
            if(temp==0){
                newItem.setName("Tin-can");
                newItem.setWeight(2);
                newItem.setValue(1);
                newItem.setStrength(0);
            }
            else if(temp==1){
                newItem.setName("Boot");
                newItem.setWeight(4);
                newItem.setValue(2);
                newItem.setStrength(1);
            }
            else if(temp==2){
                newItem.setName("Pen");
                newItem.setWeight(1);
                newItem.setValue(1);
                newItem.setStrength(2);
            }
            else if(temp==3){
                newItem.setName("Wallet");
                newItem.setWeight(1);
                newItem.setValue(13);
                newItem.setStrength(0);
            }
            else if(temp==4){
                newItem.setName("Rope");
                newItem.setWeight(3);
                newItem.setValue(2);
                newItem.setStrength(3);
            }
        }

        return newItem;
    }


}
