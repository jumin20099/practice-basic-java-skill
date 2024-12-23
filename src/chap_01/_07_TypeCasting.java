package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환

        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((char)score); // 개신기한거 발견 정수를 캐릭터로 형변환 때리면 유니코드로 변환 돼서 출력됨 93은 유니코드로 ] 여서 ] 가 출력됨 ㄷㄷ
        System.out.println((int)']'); // 이렇게 하면 ] 의 유니코드 값도 확인 가능 ㄷㄷ

        // 근데 그럼 숫자는 어떻게 문자열로 바꾸냐?
        String s1 = String.valueOf(score); // 이렇게 valueOf() 라는 클래스를 사용 해야함
        s1 = Integer.toString(score); // valueOf() 싫으면 이럭게 하면 댐
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);

        // 문자열을 숫자로!
        int i = Integer.parseInt("93");
        double d = Double.parseDouble("93");

        score = 93 + (int)98.8;
        System.out.println(score); // 191

        double score_d = 93 + 98.8;
        System.out.println(score_d); // 191.8

        double convertedScoreDouble = score;
        System.out.println(convertedScoreDouble); // 191.0
        // int -> long -> float -> double (작은거에서 큰거로는 자동 형변환 됨)

        // int convertedScoreInt = score_d; 이건 안됨 왜냐? 큰거(double)에서 작은거(int)로 갈려고 햇으니까 안댐 191.8 -> 191 뒤에가 짤리는거 자바는 절대 못참음 미친색기
        int convertedScoreInt = (int)score_d; // 그래서 이렇게 형변환 수동으로 해줘야함
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int (큰거에서 작은거로는 수동 형변환 해야함)

    }
}
