package Baekjoon;

import java.util.Scanner;

public class B1157 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //대문자 전환 + a에 변환한 값 담아줘야함
        a = a.toUpperCase();

        //String[] b = a.split("");
        //스플릿으로 끊어도 되는데 한글자씩 편의를 위해서 charAt사용


        //알파벳 지정해줄 배열
        int[] arr = new int[26];

        //입력받은 값의 길이만큼 하나씩 다 떼서 알파벳으로 저장
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'A']++;
        }

        //max = 최댓값
        //count = 최댓값이 같은 값이 몇개인지
        //max_index = 최댓값의 알파벳, 인덱스 값
        int max = 0;
        int count = 0;
        int max_index=0;

        //최댓값의 알파벳값을 저장하는 반복문
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
                max_index=i;
            }
        }

        //최댓값에 많이 나온 알파벳을 대입, 갯수+
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                count++;
            }
        }
        //최댓값이 같은 게 2가지 이상이면 ?출력
        if (count >= 2) {
            System.out.println("?");
        }
        //인덱스 값 강제 형변환
        //배열은 0번부터기 때문에 A(첫번째)값을 더해줘야함
        else {
            System.out.println((char)(max_index+'A'));
        }
    }

}