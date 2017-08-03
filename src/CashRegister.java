import java.util.ArrayList;
import java.util.Scanner;


public class CashRegister {

    public static void register(ArrayList<Product> orderList, double sumTotal) {

        String crt = "credit";
        String csh = "cash";
        String chk = "check";

        for (int i = 0; i < 107; i++) {
            System.out.print("*");

        }
        System.out.println("\n");


        for (Product c : orderList) {

            System.out.println("\n" + c);
        }
        for (int i = 0; i < 107; i++) {
            System.out.print("*");

        }
        double grandTotal = sumTotal * 1.06;
        System.out.printf("\nTax: %.2f", sumTotal * .06);
        System.out.printf("\nYour total is:  $%.2f", grandTotal);

        System.out.println("\nWhat is your method of payment? (type Credit/Cash/Check)");

        Scanner scan = new Scanner(System.in);
        String pymtMeth = scan.nextLine();

        if (pymtMeth.equalsIgnoreCase("credit")) {
            System.out.println("\n\nPlease enter CC# - take your time, must be 16 digits");
            int numDigits = 0;
            long ccNum = scan.nextInt();
            while (ccNum > 0) {         //calculate & print number of digits in the number
                ccNum = ccNum / 10;
                numDigits = numDigits + 1;
                System.out.println(numDigits );

                if (numDigits < 1) {
                    System.out.println("Please re-enter CC #");
                }  //eventually, when printing the receipt - output the last 4 digits using
                // char ccNum = password.charAt(length - 1) + (length -2) + (length - 3) + (length -4)

                if (pymtMeth.equalsIgnoreCase("check")) {
                    System.out.println("Enter the check #:");
                    int chNum = scan.nextInt();
                } else {
                    System.out.println("Show me the money!!!");
                }
            }
        }
        for (int i = 0; i < 107; i++) {
            System.out.print("*");

        }
        System.out.println("\n");


        for (Product c : orderList) {

            System.out.println("\n" + c);
        }
        for (int i = 0; i < 107; i++) {
            System.out.print("*");

        }
        System.out.println("");
        System.out.printf("\nTax: %.2f", sumTotal * .06);
        System.out.printf("\nYour total is:  $%.2f", grandTotal);


//    public String toString(){
//
//        String result = "";
//
//        System.out.printf("%-2d %-12s %-18s %-55s %-10s %.2f",itemNumberM ,categoryM, itemNameM, descriptionM, miscInfoM, priceM);
//
//        return result;
//    }

    }
}


