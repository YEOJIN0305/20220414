package Etc;

import java.util.Scanner;

public class Date3_30_Quiz {
    public static void main(String[] args) {
        //내가 입력한 숫자가 홀인지 짝인지
        Scanner s = new Scanner(System.in);
                int a;

        System.out.printf("숫자를 입력하세요 : ");
        a = s.nextInt();


        if(a % 2 == 0){
            System.out.printf("짝수입니다.");
        }
        else
            if(a % 2 == 1){//그냥 else일때 홀수입니다 출력만 해도 가능
                System.out.printf("홀수입니다.");
            }
    }
}
