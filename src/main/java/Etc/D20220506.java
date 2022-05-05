package Etc;

import java.util.HashMap;
import java.util.Map;

public class D20220506 {
    public static void main(String[] args) {
        //Map<key타입, value타입> 변수 이름 = 값
        Map<String, String> pmap = new HashMap<>();

        //key와 value의 쌍으로 데이터 추가
        pmap.put("name", "최여진");
        pmap.put("nickname", "최여진");
        pmap.put("email", "choi@nav");
        pmap.put("addr", "서울");
        pmap.put("dept", "디콘");
        pmap.put("dept", "데분");

        System.out.println("이름 : "+ pmap.get("name"));
        System.out.println("닉네임 : "+ pmap.get("nickname"));
        System.out.println("이메일 : "+ pmap.get("email"));
        System.out.println("주소 : "+ pmap.get("addr"));
        System.out.println("학과 : "+ pmap.get("dept"));
        System.out.println("테스트 출력 : "+ pmap.get("오타"));

    }
}
