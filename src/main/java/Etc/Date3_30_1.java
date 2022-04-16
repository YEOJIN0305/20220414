package Etc;

public class Date3_30_1 {//서식지정 자릿수 맞추기
    public static void main(String[] args) {
        System.out.printf("%d\n", 123);//정수형 서식 활용
        System.out.printf("%5d\n", 123);
        System.out.printf("%05d\n", 123);

        System.out.printf("%f\n", 123.45);//실수형 서식 활용
        System.out.printf("%7.1f\n", 123.45);
        System.out.printf("%7.3f\n", 123.45);

        System.out.printf("%s\n", "Hi~Java");//문자열형 서식 활용
        System.out.printf("%10s\n", "Hi~Java");
    }
}
