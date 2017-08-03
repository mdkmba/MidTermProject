import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaSoul {

    ArrayList<Product> orderList;

    public static void main(String[] args) throws IOException {

        Scanner scnr = new Scanner(System.in);

        ArrayList<Product> menuList = readFile("./JavaJointsMenu.txt");

        if (menuList == null) {
            System.out.println("Issue with file... closing");
            return;
        }
        System.out.println("\n\n\nWelcome to Java Soul!\nDown Home Cooking, UP NORTH!\nPlease take a look at our selections!\n");
        for (int i = 0; i < 107; i++) {
            System.out.print("*");

        }
        System.out.println("\n");


        for (Product c : menuList) {

            System.out.println("\n" + c);
        }
        for (int i = 0; i < 107; i++) {
            System.out.print("*");

        }
        System.out.print("\nWould you like to place an order? (Y/N): ");
        String placeOrder = "";
        placeOrder = scnr.nextLine();

        if (placeOrder.equalsIgnoreCase("N")) {
            System.out.println("Have a nice Day! Come back soon!");
            scnr.nextInt();
        } else {

            int selection = 0;

            takeOrder(menuList, selection);

        }

    }

    public static ArrayList<Product> readFile(String filename) throws IOException {
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


    public static void takeOrder(ArrayList<Product> menuList, int selection) {
        Scanner scnr = new Scanner(System.in);
        ArrayList <Product> orderList = new ArrayList<>();
        double sumTotal = 0.0;
        boolean loop = true;

        do{



            System.out.print("\nPlease make your selection (1-15): \n");
            selection = scnr.nextInt();

            switch (selection) {

                case 1:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(0));
                    System.out.print("\nHow many would you like to order?: ");
                    int numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(0));
                    }



                    break;

                case 2:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(1));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(1));
                    }



                    break;


                case 3:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(2));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(2));
                    }

                    break;

                case 4:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(3));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(3));
                    }

                    break;

                case 5:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(4));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(4));
                    }

                    break;

                case 6:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(5));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(5));
                    }

                    break;

                case 7:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(6));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(6));
                    }

                    break;

                case 8:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(7));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(7));
                    }

                    break;

                case 9:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(8));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(8));
                    }

                    break;

                case 10:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(9));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(9));
                    }

                    break;

                case 11:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(10));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(10));
                    }

                    break;

                case 12:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(11));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(11));
                    }

                    break;

                case 13:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(12));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(12));
                    }

                    break;

                case 14:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(13));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(13));
                    }

                    break;

                case 15:

                    System.out.print("You ordered: \n");
                    System.out.println(menuList.get(14));
                    System.out.print("How many would you like to order?: ");
                    numItems1 = scnr.nextInt();
                    System.out.print("\n");
                    for (int i = 0; i < numItems1; i++) {
                        orderList.add(menuList.get(14));
                    }

                    break;

                default:
            }

            sumTotal = 0;
            for (Product p : orderList ) {

                System.out.println(p);
                sumTotal += p.getPriceM();
            }System.out.printf("Current Total: %.2f\n", sumTotal);

            System.out.print("\nWould you like to order another item? (Y/N): \n\n");
            String placeOrder = "";
            placeOrder = scnr.next();

            if (placeOrder.equalsIgnoreCase("N")) {

                System.out.println("Please hold for your total");

                CashRegister.register(orderList, sumTotal);

            }
            else {

                for (int i = 0; i < 107; i++) {
                    System.out.print("*");

                }
                System.out.println("\n");


                for (Product c : menuList) {

                    System.out.println("\n" + c);
                }
                for (int i = 0; i < 107; i++) {
                    System.out.print("*");
                }
            }

        }while (loop);
    }
}


