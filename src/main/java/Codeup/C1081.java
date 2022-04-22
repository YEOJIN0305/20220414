package Codeup;

import java.util.Scanner;

public class C1081 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int i = 3;
        int j = 6;

        for(a=1; a<=i; a++){
            for(b=1; b<=j; b++){
                System.out.printf("%d %d\n", a, b);
            }
        }

    }
}
