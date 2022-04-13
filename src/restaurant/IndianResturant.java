package restaurant;

public class IndianResturant {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Order order = new Order();
        // print all menu in resturant
        System.out.println(menu.toString());
        System.out.println(order.toString());
    }
}

    /*
    //get the number of apptetizers in our menu
        int sizeOfApptetizer = menu.getApptetizerSize();
        System.out.println("Apptetizers: "+sizeOfApptetizer);


        //prints a list of the apptetizers
        System.out.println(menu.getAllAppetizers());


        //particular item in menu
       Item myItem =  menu.getAppetizers(1);
        System.out.println(myItem);
*/
