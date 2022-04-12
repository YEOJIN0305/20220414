import java.util.Scanner;

public class D4_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=0;


        while (b<a){
            b++;
            int c = s.nextInt();
            int d = s.nextInt();
            System.out.println(c+d);
        }

    }
}