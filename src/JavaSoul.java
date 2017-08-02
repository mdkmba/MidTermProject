import javax.annotation.processing.FilerException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class JavaSoul {
    public static void main(String[] args) throws IOException {

        ArrayList<Product> menuList = readFile("./JavaJointsMenu.txt");

        if (menuList == null) {
            System.out.println("Issue with file... closing");
            return;
        }
        System.out.println("\n\n\nWelcome to Java Soul!\nDown Home Cooking, UP NORTH!\nPlease make your selection from our menu.\n");
        for (int i = 0; i < 107; i++){
            System.out.print("*");

        }
        System.out.println("\n\n");

        //now I have a filled ArrayList of s
        //  at least in theory...

        //now do the rest of your program using this list

        //output this list
        //enhanced for (foreach) to go through list
        for (Product c: menuList) {
            //toString does the formatting
            System.out.println("\n" + c);
        }
        for (int i = 0; i < 107; i++){
            System.out.print("*");

        }

    }

    public static ArrayList<Product> readFile (String filename) throws IOException{
        ArrayList<Product> menuList = new ArrayList<>();

        try {
            Path menuPath = Paths.get(filename);
            File menuFile = menuPath.toFile();
            FileReader fileRdr = new FileReader(menuFile);
            BufferedReader in = new BufferedReader(fileRdr);

            //read in the first line
            String line = in.readLine();

            //as long as there's another line
            while (line != null) {
                //break the line apart based on tabs
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

                //add the new Product into ArrayList
                menuList.add(c);

                //read in the next line for the next iteration
                line = in.readLine();
            }

        } catch (IOException e) {
            System.out.println(e);
            return null;
        }

        return menuList;
    }
}