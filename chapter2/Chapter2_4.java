package chapter2_4;

import java.util.Scanner;

public class Chapter2_4 {

    public static void main(String[] args) {
//        CONVERT POUNDS INTO KILOGRAMS 
        Scanner in = new Scanner(System.in);
        double pound, kilo;
        System.out.print("Enter a number in pounds: ");
        pound = in.nextDouble();
        kilo = pound * 0.454;
        System.out.println(pound + " pounds is " + kilo + " kilograms");

    }

}
