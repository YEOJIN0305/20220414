package Codeup;

import java.util.Scanner;

public class C1070 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if ((a == 1) || (a == 2) || (a == 12)) {
            System.out.print("winter");
        } else if ((a == 3) || (a == 4) || (a == 5)) {
            System.out.print("spring");
        } else if ((a == 6) || (a == 7) || (a == 8)) {
            System.out.print("summer");
        } else if ((a == 9) || (a == 10) || (a == 11)) {
            System.out.print("fall");
        }
    }
}
