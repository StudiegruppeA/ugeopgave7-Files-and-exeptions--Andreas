package Assignment2;

public class Main {


    public void main() {
        Drink d1 = new Drink("test", 100);

        try {
            d1.setPrice(-1);
        }catch (IllegalArgumentException e){
            System.out.println("price cant be under 0");
        }
        try {
            d1.getItem(2);
        }catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }

}
