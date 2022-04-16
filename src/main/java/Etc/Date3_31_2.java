package Etc;

import java.util.Scanner;

public class Date3_31_2 {//점수 입력받고 등급 매기기

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("점수를 입력하세요 : ");
        a = s.nextInt();

        if (a >= 90) {
            System.out.print("A등급입니다.");
        } else if (a >= 80) {
            System.out.print("B등급입니다.");
        } else if (a >= 70) {
            System.out.print("C등급입니다.");
        } else if (a < 70) {
            System.out.print("미달입니다.");
        }
    }
}