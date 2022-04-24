package Baekjoon;

import java.util.Scanner;

public class B2443 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int star = a * 2 - 1;
        int none = 0;

        for (int i = 0; i < a; i++) {
            for (int j = star+none; j > 0 ; j--) {
                if (j <= star) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            none++;
            star-=2;
        }

    }
}
