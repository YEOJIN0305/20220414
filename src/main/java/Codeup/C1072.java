package Codeup;

import java.util.Scanner;

public class C1072 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int[] aa = new int[a];

        for(int i = 0; i<a; i++){
            aa[i] = s.nextInt();
        }

        for (int i = 0; i<a; i++){
            System.out.println(aa[i]);
        }

    }
}
