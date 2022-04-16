package Etc;

import java.util.Scanner;

public class Date3_31_3 {//단을 입력받는 구구단
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇 단 : ");
        int dan = s.nextInt();
        System.out.println(dan + "단");
        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + "x" + i + "=" + (dan * i));
        }

    }
}
