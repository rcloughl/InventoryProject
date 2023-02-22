import java.util.ArrayList;
import java.util.Scanner;

//This class controls the inventory system and the methods that change it
public class Inventory {

    private static ArrayList<Item> inventory = new ArrayList<>();
    private static int weight = 130;
    private static Item equippedWeapon;
    private static Item equippedArmor;

    public static boolean totalWeight(Item item){
        int currentTotal=item.getWeight();
        for (Item i : Inventory.inventory)
            currentTotal+=i.getWeight();
        if(equippedWeapon!=null)
            currentTotal+= equippedWeapon.getWeight();
        if(equippedArmor!=null)
            currentTotal+= equippedArmor.getWeight();

        if (currentTotal<weight)
            return true;
        else return false;

    }

    public static void print() {
        System.out.format("%-15s%-8s%-8s%-12s%n","Item","Weight","Value","Strength");
        for (Item i : Inventory.inventory)
            System.out.format("%-15s%6d%7d%11d%n", i.getName(), i.getWeight(), i.getValue(), i.getStrength());
    }

    public static void add(){
        Item item = ItemGenerator.generate();
        if (totalWeight(item)==true) {
            Inventory.inventory.add(item);
            System.out.println(item.getName() + " was added to the inventory.");
        }
    }

    public static void drop() {
        Scanner input = new Scanner(System.in);
        int index = 1;
        String remove = "";
        for (Item i : Inventory.inventory) {
            System.out.format(index + " " + "%-15s%4d%5d%9d%n", i.getName(), i.getWeight(), i.getValue(), i.getStrength());
            index++;
        }
        if (index != 1) {
            System.out.println("Select an item to remove:");
            remove = input.nextLine();
            index = Integer.parseInt(remove);
            System.out.println(inventory.get(index-1).getName()+" was removed.");
            Inventory.inventory.remove(index - 1);
        } else if (index == 1) {
            System.out.println("Your inventory is empty!");
        }
    }

    public static void equipWeapon(){
        Scanner input = new Scanner(System.in);
        int index = 0;
        int count = 1;
        String remove;
        int placeKeeper[]= new int[inventory.size()];
        System.out.format("%-15s%-8s%-8s%-12s%n","Item","Weight","Value","Strength");
        for (Item i : Inventory.inventory) {
            if(i.getType()==ItemType.Weapon) {
                System.out.format(count + " " + "%-15s%4d%5d%9d%n", i.getName(), i.getWeight(), i.getValue(), i.getStrength());
                placeKeeper[count-1]=index;
                count++;
            }
            index++;
        }
        if (count != 1) {
            System.out.println("Select an item to equip:");
            remove = input.nextLine();
            index = Integer.parseInt(remove);
            equippedWeapon=Inventory.inventory.get(placeKeeper[index-1]);
            System.out.println(equippedWeapon.getName() + " successfully equipped.");
            Inventory.inventory.remove(placeKeeper[index-1]);
        } else if (count == 1) {
            System.out.println("You have nothing to equip!");
        }
    }

    public static void equipArmor(){
            Scanner input = new Scanner(System.in);
            int index = 0;
            int count = 1;
            String remove;
            int placeKeeper[]= new int[inventory.size()];
            System.out.format("%-15s%-8s%-8s%-12s%n","Item","Weight","Value","Strength");
            for (Item i : Inventory.inventory) {
                if(i.getType()==ItemType.Armor) {
                    System.out.format(count + " " + "%-15s%4d%5d%9d%n", i.getName(), i.getWeight(), i.getValue(), i.getStrength());
                    placeKeeper[count-1]=index;
                    count++;
                }
                index++;
            }
            if (count != 1) {
                System.out.println("Select an item to equip:");
                remove = input.nextLine();
                index = Integer.parseInt(remove);
                equippedArmor=Inventory.inventory.get(placeKeeper[index-1]);
                System.out.println(equippedArmor.getName() + " successfully equipped.");
                Inventory.inventory.remove(placeKeeper[index-1]);
            } else if (count == 1) {
                System.out.println("You have nothing to equip!");
            }
    }
}
