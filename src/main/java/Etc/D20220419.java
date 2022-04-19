package Etc;

public class D20220419 {
    public static void main(String[] args) {
        int i =1;
        int j = 1;

        while(i<10){
            j=1;
            if ((i==3)||(i==5)){
                System.out.println("<"+i+"단>");
            }
            while(j<10){
                System.out.println(i+"x"+j+"="+(i*j));
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
