package Baekjoon;

import java.util.Scanner;

public class B2588 { //세자리X세자리
    public static void main(String[] args) {

        try{

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String b = s.next();
        String[] arr = new String[3];
        arr = b.split("");


        //밑에 들어가는 세자리 숫자값 저장할 배열
        //밑에 숫자만 하나씩 떼가지고 위에 숫자들은 뗄 필요 없이 다 곱한다
        //마지막 줄은 떼지 않고 둘다 세자리씩 곱한 값

            System.out.println(Integer.parseInt(arr[2])*a);
            System.out.println(Integer.parseInt(arr[1])*a);
            System.out.println(Integer.parseInt(arr[0])*a);
            System.out.println(Integer.parseInt(b)*a);

            //따로따로 arr[0]부터 순차적으로 출력하면 3 8 5 제대로 뜨는데 왜 곱한 값은 반대로 뜨는지

    }

        catch (NumberFormatException e){}
    }


}
