package Assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<Drink> drinks;




    public void loadData(String path) {
        File file = new File(path);
        Scanner scan;
            try {
                scan = new Scanner(file);



                drinks.add(new Drink(scan))
            } catch (FileNotFoundException e) {
                System.out.println("Vi kunne ikke finde menuen");
            }
        }
    }

