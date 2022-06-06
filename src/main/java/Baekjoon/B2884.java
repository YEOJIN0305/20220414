package Baekjoon;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = new String[2];
        arr = a.split(" ");

        //2자리씩 숫자 분리
        //빼는 경우만 있기때문에 분이나 시가 0보다 작아질 때만 생각한다
        //불필요한 0빼고 출력
        //09 25X     9 25
        //두자릿수 자체로 입력을 받으니까 앞에 불필요한 0이 안나오지 않을까 생각

        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[0]);

        //b값에 상관없이 b엔 b-45가 저장
        //c를 0에서 23으로 만드는 건 b가 45보다 작을 때인 if문 안에서 if문을 하나 더 써야함

        if (b < 45) {
            b = b + 15;
            c = c - 1;

            if (c == -1) {
                c = c + 24;
            }
        }

        else if (b >= 45) {
            b = b - 45;
        }
        System.out.println(c + " " + b);
    }
}
