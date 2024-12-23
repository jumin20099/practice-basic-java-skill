package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금 정산

        String car = "경차";
        boolean disabled = false;
        int price = 0;

        for (int hour = 1; hour < 21; hour++) {
            price = hour * 4000;
            if (price > 30000) {
                System.out.println("일일 최대 요금은 3만원 입니다.");
                price = 30000;
                break;
            }
            if (car == "경차" || disabled) {
                price /= 2;
                System.out.println(price);
            }
        }
        System.out.println("최종 요금은 " + price);
    }
}
