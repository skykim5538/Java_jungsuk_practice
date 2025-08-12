package ch6.Ex6_20;

public class MemberCall {
    int iv = 10;
    static int cv =20;

    int iv2 =cv;
    static int cv2 =new MemberCall().iv;

    static void staticMethod() {
        System.out.println(cv);
        MemberCall mc = new MemberCall();
        System.out.println(mc.iv);
    }
    void instanceMethod(){
        System.out.println(cv);
        System.out.println(iv);

    }
    static void staticMethod2(){
        staticMethod();
        MemberCall mc = new MemberCall();
        mc.instanceMethod();
    }
    void instanceMethod2(){
        staticMethod2();
        instanceMethod2();
    }
}
