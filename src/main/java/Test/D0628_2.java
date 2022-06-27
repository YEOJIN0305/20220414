package Test;

public class D0628_2 {
    public static void main(String[] args) {


        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        String[] item = log.split(" ");


        System.out.println("time : " + item[3].substring(1));
        //세번째 배열의 첫번째 자릿수(문자열)부터 출력(괄호 지우기)
        //자릿수도 0부터 시작

    }
}
