import javax.annotation.processing.FilerException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class JavaSoul {



    public static void main(String[] args) throws IOException {

        Scanner scnr = new Scanner(System.in);

        ArrayList<Product> menuList = readFile("./JavaJointsMenu.txt");

        if (menuList == null) {
            System.out.println("Issue with file... closing");
            return;
        }
        System.out.println("\n\n\nWelcome to Java Soul!\nDown Home Cooking, UP NORTH!\nPlease take a look at our selections!\n");
        for (int i = 0; i < 107; i++){
            System.out.print("*");

        }
        System.out.println("\n");


        for (Product c: menuList) {

            System.out.println("\n" + c);
        }
        for (int i = 0; i < 107; i++){
            System.out.print("*");

        }
        System.out.print("\nWould you like to order from our delicious menu? (Y/N): ");
        String placeOrder = "";
        placeOrder = scnr.nextLine();
//        if (placeOrder.equalsIgnoreCase("N")) {
//            System.out.println("Have a nice Day! Come back soon!");
//            scnr.nextInt();
//        }
//        else{
//
//            Ordering();
//        }
    }

    public static ArrayList<Product> readFile (String filename) throws IOException{
        ArrayList<Product> menuList = new ArrayList<>();

        try {
            Path menuPath = Paths.get(filename);
            File menuFile = menuPath.toFile();
            FileReader fileRdr = new FileReader(menuFile);
            BufferedReader in = new BufferedReader(fileRdr);

            String line = in.readLine();

            while (line != null) {


                String[] details = line.split("\t");

                if (details.length < 0) {
                    System.out.println("Bad line format--halting read");
                    break;
                }
                int itemNumber = Integer.parseInt(details[0]);

                String category = details[1];

                String itemName = details[2];

                String description = details[3];

                String miscInfo = details[4];

                double price = Double.parseDouble(details[5]);



                Product c = new Product(itemNumber, category, itemName, description, miscInfo, price);

                menuList.add(c);

                line = in.readLine();
            }

        } catch (IOException e) {
            System.out.println(e);
            return null;
        }

        return menuList;
    }




}