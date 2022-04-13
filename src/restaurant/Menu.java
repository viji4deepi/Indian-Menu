package restaurant;

import java.util.ArrayList;

public class Menu {
    //fields
    private ArrayList<Item> appetizers = new ArrayList<>();
    private ArrayList<Item> noodles = new ArrayList<>();
    private ArrayList<Item> main = new ArrayList<>();
    private ArrayList<Item> dessert = new ArrayList<>();
    private ArrayList<Item> drinks = new ArrayList<>();

    //constuctors
    public Menu() {
        populateMenu();
    }

    //assessors and mutators
    //returns a specific appetizer
    public Item getAppetizers(int index) {
        return appetizers.get(index);
    }

    //return the size of the category apptetizers
    public int getApptetizerSize() {
        return appetizers.size();
    }

    //return all apptetizers as a string
    public String getAllAppetizers() {
        String aMenu = "";
        aMenu += "Apptetizers:\n";
        for (int i = 0; i < appetizers.size(); i++) {
            Item a = appetizers.get(i);
            //add id, name, and price
            aMenu += "A" + (i + 1) + " " + a.toString() + "\n"; //A - is for apptetizer
        }
        return aMenu;
    }

    //return all noodles as a string
    public String getAllNoodles() {
        String aMenu = "";
        aMenu += "Noodles:\n";
        for (int i = 0; i < noodles.size(); i++) {
            Item a = noodles.get(i);
            //add id, name, and price
            aMenu += "N" + (i + 1) + " " + a.toString() + "\n"; //A - is for apptetizer
        }
        return aMenu;
    }

    //return all main dishes as a string
    public String getAllDishes() {
        String aMenu = "";
        aMenu += "Main Dishes:\n";
        for (int i = 0; i < main.size(); i++) {
            Item a = main.get(i);
            //add id, name, and price
            aMenu += "M" + (i + 1) + " " + a.toString() + "\n"; //A - is for apptetizer
        }
        return aMenu;
    }
    //return all deserts as a string
    public String getAllDesserts() {
        String aMenu = "";
        aMenu += "Desserts:\n";
        for (int i =0;i<dessert.size();i++) {
            Item a = dessert.get(i);
            aMenu += "D" +(i+1) + " "+a.toString() +"\n";
        }
        return aMenu;
    }

    //Methods
    public void populateMenu() {
        //apptizers
        appetizers.add(new Item("Chicken 65\t\t", "Apptetizers", 6.00));
        appetizers.add(new Item(" Samosa\t\t\t", "Apptetizers", 1.00));
        appetizers.add(new Item("cutlet\t\t\t", "Apptetizers", 1.00));
        appetizers.add((new Item("Chicken lolipop\t", "Apptetizers", 6.00)));

        //noodles
        noodles.add(new Item("Vegetable Noodles\t", "Noodles", 7.99));
        noodles.add(new Item("Egg Noodles\t\t\t", "Noodles", 8.99));
        noodles.add(new Item("Chicken Noodles\t\t", "Noodles", 9.99));
        noodles.add(new Item("Sea Food Noodles\t\t", "Noodles", 10.99));

        // main dishes
        main.add(new Item("Vegetable briyani\t", "Briyani", 7.99));
        main.add(new Item("Egg Noodles\t\t\t", "Briyani", 8.99));
        main.add(new Item("Chicken Dum briyani\t", "Briyani", 10.99));
        main.add(new Item("Goat Chukka Briyani\t", "Briyani", 12.99));


        //dessert
        dessert.add(new Item("Gluab Jamun\t\t", "Dessert", 3.00));
        dessert.add(new Item("Rasagulla\t\t", "Dessert", 3.00));

        //size
        drinks.add(new Item("Water\t\t", "Drinks", 1.0));
        drinks.add(new Item("Juice\t\t", "Drinks", 3.0));

    }

    //toString
    //print out full menu in one string
    public String toString() {
        String menu = "";
        menu += " Indian  Menu \n" + "--------------------------------------\n";
        menu += getAllAppetizers() + "\n";
        menu += getAllNoodles() + "\n";
        menu += getAllDishes() +"\n";
        menu += getAllDesserts() +"\n";
        return menu;
    }
}
