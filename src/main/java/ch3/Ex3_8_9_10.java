package ch3;

public class Ex3_8_9_10 {
    public static void main(String args[]) {

        Ex3_8 ex3_8 = new Ex3_8();
        Ex3_9 ex3_9 = new Ex3_9();
        Ex3_10 ex3_10 = new Ex3_10();

        ex3_8.method();
        ex3_9.method();
        ex3_10.method();

    }
}

class Ex3_8 {
    byte a = 10;
    byte b = 30;
    byte c = (byte) (a * b);
    //byte c1= (a*b); a*b =300
    // byte 타입 범위 (2byte) -> -128~127 **오버플로우 발생
    // 300을 byte로 강제 케스팅하면, 300/256 =1, 나머지 44
    // 따라서 300-> 44가 됨
        public void method() {
            System.out.println("Ex3_8 = "+ c);
        }
}


    class Ex3_9 {
        int x = 1_000_000;
        int y = 2_000_000;
        long z = x * y;
        // long으로 형변환 되기 전에 이미 int로 연산됨
        // 2^10*12 / 2^32
        //-> 연산되기 전에 미리 형변환을 해야 함.
        //
        public void method() {
            System.out.println("Ex3_9 = "+ z);
        }
    }

    class Ex3_10 {
        long x1 = 1_000_000 * 1_000_000;
        long y1 = 1_000_000 * 1_000_000L;

        public void method () {
            System.out.println("x1 = " + x1);
            System.out.println("y1 = " + y1);
        }
    }








