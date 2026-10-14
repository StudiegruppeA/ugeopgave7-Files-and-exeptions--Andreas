package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    Scanner scanner;
    public void main() {
        try {
            test("/home/andreas/IdeaProjects/ugepgave/src/Assignment3/test.csv");
        }catch (FileNotFoundException e) {
            System.out.println("Vi kunne ikke findfilen");
        }
    }

    public void test(String path) throws FileNotFoundException {
        File fil = new File(path);
        Scanner scanner;
            scanner = new Scanner(fil);
            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());
            }
    }
    }

