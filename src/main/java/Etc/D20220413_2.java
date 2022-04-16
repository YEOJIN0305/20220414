package Etc;

import java.util.Scanner;

public class D20220413_2 {//별찍기 피라미드

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();//피라미드

        int inc = a, dec = a;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= inc; j++) {
                if (j < dec) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            dec--;
            inc++;
        }

    }
}
