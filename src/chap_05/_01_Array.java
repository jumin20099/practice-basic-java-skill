package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열

        // 배열 선언 방법 1
        // String[] coffees = new String[4];

        // 배열 선언 방법 2
        // String coffees[] = new String[4];
        // coffees[0] = "아메리카노";
        // coffees[1] = "카푸치노";
        // coffees[2] = "라떼";
        // coffees[3] = "카페모카";
        // coffees[4] = "에스프레소";

        // 배열 선언 방법 3
        //String coffees[] = new  String[] {"아메리카노", "카푸치노", "라떼", "에스프레소"};

        // 배열 선언 방법 4
        String coffees[] = {"아메리카노", "카푸치노", "라떼", "에스프레소"};

        System.out.println(coffees[0] + " 주세요");
        coffees[0] = "카라멜마끼아또";
        System.out.println(coffees[0] + " 주세요");
    }
}
