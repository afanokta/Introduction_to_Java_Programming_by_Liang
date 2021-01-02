package chapter2_2;

import java.util.Scanner;

public class Chapter2_2 {

    public static void main(String[] args) {
//        COMPUTE VOLUME OF A CYLINDER
        Scanner in = new Scanner(System.in);
        double radius, area, length, volume;
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = in.nextDouble();
        length = in.nextDouble();
        area = radius * radius * Math.PI;
        volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }

}
