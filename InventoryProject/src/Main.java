import java.util.Scanner;
public class Main {
    //main method, this just runs the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = "0";
        while (!temp.equals("6")) {
            System.out.println("___________");
            System.out.println("1. " + "Print inventory");
            System.out.println("2. " + "Add random item");
            System.out.println("3. " + "Drop item");
            System.out.println("4. " + "Equip Weapon");
            System.out.println("5. " + "Equip Armor");
            System.out.println("6. " + "Exit");
            temp = input.nextLine();
            if (temp.equals("1")) {
                Inventory.print();
            } else if (temp.equals("2")) {
                Inventory.add();
            } else if (temp.equals("3")) {
                Inventory.drop();
            } else if (temp.equals("4")) {
                Inventory.equipWeapon();
            } else if (temp.equals("5")) {
                Inventory.equipArmor();
            } else if (temp.equals("6")) {
                break;
            }
            else {
                System.out.println("Enter a valid number!");
            }
        }


        }

    }