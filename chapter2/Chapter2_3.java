package chapter2_3;

import java.util.Scanner;

public class Chapter2_3 {

    public static void main(String[] args) {
//        CONVERT FEET INTO METERS
        Scanner in = new Scanner(System.in);
        double feet, meter;
        System.out.print("Enter a value for feet: ");
        feet = in.nextDouble();
        meter = feet * 0.305;
        System.out.println(feet + " feet is " + meter + " meters");

    }

}
