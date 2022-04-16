package Codeup;

import java.util.Scanner;

public class C1068 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if(89<a){
            System.out.print("A");
        }
        else if(69<a){
            System.out.print("B");
        }
        else if(39<a){
            System.out.print("C");
        }
        else if(40>a){
            System.out.print("D");
        }
    }
}
