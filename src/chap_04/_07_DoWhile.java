package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile

        int distance = 25;
        int move = 0;
        int height = 25;

        do {
            System.out.println(move + "m 만큼 이동했습니다");
            move += 3;
        } while (move + height < distance);
        System.out.println("완주함");
    }
}
