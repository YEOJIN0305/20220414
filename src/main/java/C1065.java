import java.util.Scanner;

public class C1065 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if (a % 2 == 0) {
            System.out.printf("%d\n", a);
        }

        if (b % 2 == 0) {
            System.out.printf("%d\n", b);
        }

        if (c % 2 == 0) {
            System.out.printf("%d\n", c);
        }
    }
}
