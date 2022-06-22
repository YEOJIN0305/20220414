package Test;

import java.util.Scanner;

public class D0608_3 {

    static int sum(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int hap;
        hap = sum(num1, num2);

        System.out.println("함수 sum의 결과는 : " + hap);

    }
}
