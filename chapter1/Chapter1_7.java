package chapter1_7;

public class Chapter1_7 {

    public static void main(String[] args) {
        double phi = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        double phi2 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));
        System.out.println(phi);
        System.out.println(phi2);
    }

}
