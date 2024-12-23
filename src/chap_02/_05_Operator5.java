package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 2;
        int y = 3;
        int max = (y>x) ? y : x;
        int min = (y<x) ? y : x;

        System.out.println(max);
        System.out.println(min);

        boolean b = (y == x) ? true : false;
        System.out.println(b);
    }
}
