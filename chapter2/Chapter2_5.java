package chapter2_5;

import java.util.Scanner;

public class Chapter2_5 {

    public static void main(String[] args) {
//        FINCANCIAL APPS : CALCULATE TIPS 
        Scanner in = new Scanner(System.in);
        double subTotal, gratuity, total;
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subTotal = in.nextDouble();
        gratuity = in.nextDouble();

        gratuity = gratuity / 100 * subTotal;
        total = subTotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

    }

}
