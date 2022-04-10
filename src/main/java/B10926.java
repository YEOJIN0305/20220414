import java.util.Scanner;

public class B10926 {//백준 입력받은 아이디 오류표시
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("id를 입력하시오 :");
        String id = s.nextLine();

        System.out.printf("%s\n", id+"??!");
    }
}