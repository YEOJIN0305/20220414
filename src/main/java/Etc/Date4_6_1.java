package Etc;

import java.util.Scanner;

public class Date4_6_1 {//윤년 구하기/윤년일때 1, 아닐 때 0을 출력
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("연도를 입력하시오 : ");
        int a = s.nextInt();

        if(a%4==0) {
            if(a%400==0) {
                System.out.println("1");
            }else if(a%100==0){
                System.out.println("0");
            }
        }
    }
}
