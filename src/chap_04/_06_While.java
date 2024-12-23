package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 while

        int distance = 25;
        int move = 0;

        while (move < distance) {
            move++;
            System.out.println(move + "m 만큼 이동하였습니다.");
        }
        if (move == 25)
            System.out.println(distance + "m 트랙을 완주하였습니다");
    }
}
