package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // 스위치 케이스

        int ranking = 3;

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상자가 아닙니다.");
                break;
        }
    }
}
