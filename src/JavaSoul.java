import java.io.*;

public class JavaSoul {





    private static String readFromFile() {
        File myFile = new File("Names.txt");
        String output = "";
        try {
            FileReader reader = new FileReader(myFile);
            BufferedReader bufReader = new BufferedReader(reader);
            String line = bufReader.readLine();// reads the first line
            while (line!=null) {
                //System.out.println(line);
                output = output+line+"\n";
                line = bufReader.readLine();// read the next line!
            }

            bufReader.close();

        } catch (Exception e) {
            System.out.println("File not found!");
        }

        return  output;
    }

}
