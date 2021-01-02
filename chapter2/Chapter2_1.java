package chapter2_1;

import java.util.Scanner;

public class Chapter2_1 {

    public static void main(String[] args) {
//        CONVERT CELCIUS TO FAHRENHEIT
        Scanner in = new Scanner(System.in);
        double fahrenheit, celsius;
        System.out.print("Enter a degree in celsius: ");
        celsius = in.nextDouble();
        fahrenheit = (9.0 / 5) * celsius + 32; // convert celsius
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }

}
