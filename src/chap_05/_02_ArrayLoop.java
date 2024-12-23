package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회

        String coffees[] = {"아메리카노", "카푸치노", "라떼", "에스프레소"};
        for (int i = 0; i < coffees.length; i++) { // 조끄튼거 문자열 길이 셀 때는 length()인데 배열 길이 셀 때는 length임 ㅅㅂ
            System.out.println(coffees[i] + " 주세용");
        }

        System.out.println();

        for (String coffee : coffees) { // coffees 배열 안에 있는 것들을 반복문 돌려서 coffee라는 변수에 그때그때 저장 한다는 소리임 이게 for each 반복문
            System.out.println(coffee + " 내놔");
        }
    }
}
