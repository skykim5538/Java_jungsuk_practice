package ch6.Ex6_6;

public class MyMathEx {
    //오버라이딩
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        long sub1 = mm.sub(5L, 3L);
        long mul1 = mm.mul(5L, 3L);
        double div1 = mm.div(5L, 4L);
        long div2 = mm.div(5L, 4L);

        System.out.println(sub1);
        System.out.println(mul1);
        System.out.println(div1);
        System.out.println(div2);
    }
}

