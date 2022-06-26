package Test;

import java.util.ArrayList;
import java.util.List;

public class D0518_2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");

        for(String name : list){
            System.out.println("이름 : " + name);
        }
    }
}
