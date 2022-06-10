package Etc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array {
    public static void main (String[] args){
        List<String> list = new ArrayList<>();

        list.add("김지태");
        list.add("김다운");
        list.add("김연");
        list.add("김성현");

        int listsize = list.size();

        //기존 for문
        for(int i = 0; i<listsize; i++){
            System.out.println("이름 : "+ list.get(i));
        }

        //foreach
        //While문에 비해 처리속도가 느린 기존 for문의 문제점 개선
        for(String name : list){
            System.out.println("이름 : " + name);
        }

        //람다식
        //처리 속도가 가장 빠름
        //주요 특징 : 비동기 방식
        //단점 : 순서가 바뀔 수 있음 / 적용 가능한 경우가 제한적
        list.forEach(name -> System.out.println("name : "+name));

        //Iterator
        //Foreach문이 개발되기 전까지 가장 많이 사용되는 반복문
        //처리속도가 기존 for문에 비해 상당히 빠르며, 개발 소스의 유지보수에 편리함
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
