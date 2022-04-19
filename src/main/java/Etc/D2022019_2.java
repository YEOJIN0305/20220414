package Etc;

public class D2022019_2 {
    public static void main(String[] args) {

        for (int i=3; i<9; i++){
            if (i%2==1){
                for (int j =1; j<10; j++){
                    System.out.println(i+"x"+j+"="+(i*j));
                }
            }
        }
    }
}
