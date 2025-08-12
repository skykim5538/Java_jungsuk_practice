package ch6.Ex6_19;

import ch6.Ex6_6.MyMath;

public class MyMathEx2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(100l,200l));
        System.out.println(MyMath2.sub(100l,200l));
        System.out.println(MyMath2.mul(100l,200l));
        System.out.println(MyMath2.div(100l,200l));

        MyMath2 mm = new MyMath2();
        mm.a = 100L;
        mm.b = 200L;

        System.out.println(mm.add());
        System.out.println(mm.sub());
        System.out.println(mm.mul());
        System.out.println(mm.div());


    }
}
