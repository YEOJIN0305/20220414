package Etc;

public class D20220504 {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" "); //공백
            }
            for (int j = 1; j <= i * 2 - 1; j++) { //나머지 별 한방에채우기.
                System.out.print("* ");
            }
            System.out.println();
        }
        //하단.
        for (int i = 4; i > 0; i--) {    //하단
            for (int j = 4; j >= i; j--) {
                System.out.print(" "); //공백
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
