package Codeup;

import java.util.Scanner;

public class C1069 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if ("A".equals(a)) {
            System.out.printf("%s", "best!!!");
        } else if ("B".equals(a)) {
            System.out.printf("%s", "good!!");
        } else if ("C".equals(a)) {
            System.out.printf("%s", "run!");
        } else if ("D".equals(a)) {
            System.out.printf("%s", "slowly~");
        } else {
            System.out.printf("%s", "what?");
        }


    }
}
