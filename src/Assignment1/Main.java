package Assignment1;

import java.util.Scanner;
public class Main {

    Scanner scan = new Scanner(System.in);
    public void main() {
        int test = promptNumber("hej");
    }

    public int promptNumber(String msg) {
        try {
            System.out.println(msg);
            return Integer.parseInt(scan.nextLine());
        }catch (Exception e) {
            System.out.println(e);
            System.out.println("Du skal skrive et nummer");
            promptNumber( msg);
        }
        return 0;
    }
}
