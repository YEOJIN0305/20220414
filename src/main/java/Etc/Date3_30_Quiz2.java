package Etc;

import java.util.Scanner;

public class Date3_30_Quiz2 {
    public static void main(String[] args) {
        //내가 입력한 숫자가 3의 배수인지 5의 배수인지 둘 다 만족하는 경우도
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("숫자를 입력하세요 : ");
        a = s.nextInt();

        if ((a % 3 == 0) && (a % 5 == 0)) {
            System.out.printf("3과 5의 배수입니다.");
        } else if (a % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (a % 5 == 0) {
            System.out.println("5의 배수입니다.");
        }

    }
}