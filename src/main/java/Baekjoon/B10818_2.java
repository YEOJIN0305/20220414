package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B10818_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int N[]=new int[num];

        for(int i = 0; i<num; i++){
            N[i] = s.nextInt();
        }

        s.close();
        Arrays.sort(N);
        System.out.print(N[0] +" "+ N[num-1]);
    }
}
