package chapter2_7;

import java.util.Scanner;

public class Chapter2_7 {

    public static void main(String[] args) {
//        FIND THE NUMBER OF YEARS
        Scanner in = new Scanner(System.in);
        int minute, year, day, dayLeft;
        System.out.print("Enter the number of minutes: ");
        minute = in.nextInt();
        day = minute / (60 * 24);
        year = day / 365;
        dayLeft = day % 365;
        System.out.println(minute + " minutes is approximately " + year + " and " + dayLeft + " days");
    }

}
