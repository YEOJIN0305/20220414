package Baekjoon;

import java.util.Scanner;

public class B2577 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int[] arr = new int[10];
        int i = 0;
        int n = a * b * c;
        int k = 0;

        while (n != 0) {
            k = (n % 10);
            arr[k]++;
            n = (n - k) / 10;

        }
        for (k = 0; k < 10; k++) {
            System.out.println(arr[k]);
        }
    }
}