package chapter2_6;

import java.util.Scanner;

public class Chapter2_6 {

    public static void main(String[] args) {
//        SUM OF ALL DIGITS
        Scanner in = new Scanner(System.in);
        int num, sum, d1, d2, d3;
        System.out.print("Enter a number between 0 and 1000: ");
        num = in.nextInt();
        d1 = num / 100;
        d2 = (num / 10) % 10;
        d3 = num % 10;
        sum = d1 + d2 + d3;
        System.out.println("The sum of the digits is " + sum);

    }

}
