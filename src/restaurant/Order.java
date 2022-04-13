package restaurant;
import java.util.Random;
import java.util.random.*;
import java.util.ArrayList;

public class Order {
    //fields
    private static int orderNo = 0;
    private ArrayList<Item> order = new ArrayList<>();


    //constructors
    public Order() {

    }

    //assessors , mutators
    /* get item from the order (accessors)*/
    public Item getItem(int index) {
        //index - it gives items at particular index
        return order.get(index);
    }

    //*add item to order(mutators)
    public void addItem(Item item) { //item - is creating an instance
        order.add(item);
    }

    //methods
    //remove item from order
    public void removeItem(Item item) {
        order.remove(item);
    }
   //get the order size or number of item in an order
   public int getSize() {
      return order.size();
   }
//clear the array or order from order added
    public void clearOrder() {
        order.clear();
    }
    //get the order number
    public int getNumber() {
        return orderNo;
    }

    // increment or decrement order number
    public void incrementNo(){
        orderNo++;
    }

    //get a random server for the order
    public String getServer() {
        Random rand = new Random();
        int num = rand.nextInt(10) +1;
        switch (num) {
            case 1:
                return "Brenda";

            case 2:
                return  "Polly";

            case 3:
                return "Fred";

            case 4:
                return "Robert";

            case 5:
                return "Sally";

            case 6:
                return "Lilly";

            default:
                return "no server";

        }// end of switch
    } //end of method

    //toString
    public String toString(){
        String str= "";
    for(int i =0;i< order.size();i++) {
        str +=order.get(i).toString() +"\n";

    }
       return str;
    }
}
