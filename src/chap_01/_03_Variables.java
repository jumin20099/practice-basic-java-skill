package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "김주민"; //문자열 변수
        int hour = 15; //정수형 변수

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5; //실수형 변수
        char grade = 'A'; //문자 변수( 문자 하나만 쓸때 사용, 캐릭터 쓸땐 '' 사용 )
        name = "박민영"; //변수값 업데이트
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println(name + "님의 학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println(name + "님은 이번 필기 시험에 합격했을까요? " + pass);

        double d = 3.14123123;
        float f = 3.14123123F; //이런 정수형 변수들은 뒤에 변수 앞글자를 붙히는거 같음 아마도

        System.out.println(d);
        System.out.println(f);

        long l = 10000000000L;
        l = 10_000_000_000L;

        System.out.println(l);

        final String GENDER = "남자";

        System.out.println(GENDER);

        // GENDER = "여자";

        /*
        2147483647 이하 정수는 int
        2147483648 이상 정수는 long
        적은 소수점을 가진 실수는 float
        많은 소수점을 가진 실수는 double
        문자 하나는 char
        여러 문자는 String(이건 앞글자 대문자임)
        참 혹은 거짓은 boolean
        상수는 final 그리고 상수명은 무조건 대문자로
        */
    }
}
