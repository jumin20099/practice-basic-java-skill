package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if

        int hour = 10;
        boolean pm = true;
        if(hour >= 10 && !pm){
            System.out.println("잘 시간입니다.");
        } else{
            System.out.println("아직 잘 시간이 아닙니다.");
        }
    }
}
