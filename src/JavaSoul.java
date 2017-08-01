import java.io.*;
import java.util.*;


public class JavaSoul {

    public static void main(String[] args) throws FileNotFoundException{

        ArrayList<String> menu1 = new ArrayList<>();

        Scanner scnr = new Scanner(System.in);



        String readText = readFromFile();

        menu1.add(readText);

        for (Product x : menu1) {

            System.out.println(x + "MDK");

        }
    }

    private static String readFromFile() throws FileNotFoundException {
        File myFile = new File("JavaJointsMenu.txt");
        String output = "";
        try {
            FileReader reader = new FileReader(myFile);
            BufferedReader bufReader = new BufferedReader(reader);
            String line = bufReader.readLine();// reads the first line
            while (line != null) {
                //System.out.println(line);
                output = output + line + "\n";
                line = bufReader.readLine();// read the next line!
            }

            bufReader.close();

        } catch (Exception e) {
            System.out.println("File not found!");
        }

        return output;
    }


}