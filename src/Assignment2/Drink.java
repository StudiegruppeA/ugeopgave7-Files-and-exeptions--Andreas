package Assignment2;

import java.util.ArrayList;

public class Drink {
    private String name;
    private double price;
    private ArrayList<String> item;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
        item = new ArrayList<>();
        item.add("den her");
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if(price < 0) {
           throw new IllegalArgumentException();
        }
            this.price = price;
        }

    public String getItem(int i){
        if (i > item.size() ) {
            throw new IllegalArgumentException("Index is size" + item.size());
        }
        return item.get(i);
    }
}
