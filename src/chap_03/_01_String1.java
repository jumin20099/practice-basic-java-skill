package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "하 JavaScript가 그립습니다 흑 흑 ㅠㅠ. Java 어려웡.";
        System.out.println(s);

        System.out.println(s.length()); // 문자열 길이 세기

        System.out.println(s.toUpperCase()); // 대문자로 변경
        System.out.println(s.toLowerCase()); // 소문자로 변경

        System.out.println(s.contains("Java")); // 포함 된다면 true 안되면 fasle
        System.out.println(s.indexOf("Java")); // 위치 정보 확인 만약에 찾고자 하는게 없다면 -1 출력
        System.out.println(s.startsWith("하")); // 이 문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 ture 아니면 false
    }
}
