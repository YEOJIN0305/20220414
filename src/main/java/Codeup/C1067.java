package Codeup;

import java.util.Scanner;

public class C1067 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        if (a>0){
            if (a%2==0){
                System.out.println("plus");
                System.out.println("even");
            }
            else{
                System.out.println("plus");
                System.out.println("odd");
            }
        }
        if (a<0){
            if (a%2==0) {
                System.out.println("minus");
                System.out.println("even");
            }
            else{
                System.out.println("minus");
                System.out.println("odd");
            }
        }
    }
}
