package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        int val = 10;
        System.out.println(val++);
        System.out.println(val);

        System.out.println(++val);
        System.out.println(val);

        boolean 김치찌개 = true;
        boolean 된장찌개 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 된장찌개 || 제육볶음);
        System.out.println(김치찌개 && 된장찌개 && 제육볶음);

        System.out.println(5>3 && 6>5 && 6==6 && 6>=7);

        System.out.println(!(5>3));

        // || = or, && = and
    }
}
