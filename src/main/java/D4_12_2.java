import java.util.Scanner;

public class D4_12_2 {//합 구하는거 곱으로 + while문
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int sum = 1;
        int k = 1;
        while(k<a) {
            k++;
            sum = sum * k;
        }
        System.out.println(sum);
    }
}