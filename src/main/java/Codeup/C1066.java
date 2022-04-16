package Codeup;

import java.util.Scanner;

public class C1066 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if (a % 2 == 0) {
            System.out.printf("%s\n", "even");
        }

        else {
            System.out.printf("%s\n", "odd");
        }

        if (b % 2 == 0) {
            System.out.printf("%s\n", "even");
        }

        else {
            System.out.printf("%s\n", "odd");
        }

        if (c % 2 == 0) {
            System.out.printf("%s\n", "even");
        }

        else {
            System.out.printf("%s\n", "odd");
        }

    }
}
