package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "      하 javaScript가 그립습니다 흑 흑 ㅠㅠ. Java 어려웡.     ";

        // 문자열 변환
        System.out.println(s.replace(" 그립습니다", " 안 그립습니다."));
        System.out.println(s.substring(28)); // 인덱스 기준부터 시작
        System.out.println(s.substring(s.indexOf("Java")) ); // 위 코드와 동일
        System.out.println(s.substring(s.indexOf("그립습니다"), s.indexOf("."))); // 끝날땐 인덱스 전까지만 출력됨 아주 지 좃대로임

        // 공백 제거
        System.out.println(s.trim()); // 앞뒤 공백 제거
    }
}
