package Test;

import java.util.ArrayList;
import java.util.List;

public class D0518_3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");

        list.forEach(name -> System.out.println("name : " + name));

    }
}
