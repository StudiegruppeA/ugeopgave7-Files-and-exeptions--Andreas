package Assignment4;

import java.util.ArrayList;

public class Main {
    public void main() {
        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");
        data.add("Vand, Stille kildevand, gratis");

        double sum = 0;
        int count = 0;


        try {
            for (String d : data) {
                String[] test = d.split(",");
                double price = Double.parseDouble(test[2]);
                sum += price;
                count++;
            }
        }catch (NumberFormatException e) {
            System.out.println("Fejl i index " + count);
        }


        System.out.println(sum);


    }
}
