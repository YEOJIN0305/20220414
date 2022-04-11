import java.util.Scanner;

public class C1078 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b;
        int sum=0;

        for(b=1;b<=a;b++){
            if(b%2==0){
                sum = sum+b;
            }
        }System.out.println(sum);

    }
}