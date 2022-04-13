package restaurant;
import java.text.NumberFormat;
public class Item {

    //fields
    private String name;
    private Double price;
    private String category;
    private String dessert;
    private int size;

    NumberFormat numForm = NumberFormat.getCurrencyInstance();

    //constructors
    public Item (String name, String category, Double price) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    //accessors and mutators

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() { return price; }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDessert() { return dessert; }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public int getSize() { return size; }

    public void setSize(int size) {
        this.size = size;
    }

    //toString
    public String toString() {
       return  name +"\t"+ numForm.format(price);

    }

}