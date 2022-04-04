import java.util.Scanner;

public class Date4_5_1 {//A와 B의 값을 비교하는 프로그램 - 백준
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("A와 B를 입력하시오 : ");
        int A = s.nextInt();
        int B = s.nextInt();

        if (A == B) {
            System.out.print("=");
        } else if (A > B) {
            System.out.print(">");
        } else if (A < B) {
            System.out.print("<");
        }
    }
}
