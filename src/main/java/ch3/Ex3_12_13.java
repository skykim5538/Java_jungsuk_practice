package ch3;

import org.w3c.dom.ls.LSOutput;

public class Ex3_12_13 {
    public static void main(String[] args) {
        //나머지 연산자

        Ex3_12 ex3_12 = new Ex3_12();
        Ex3_13 ex3_13 = new Ex3_13();

        ex3_12.method();
        ex3_13.method();


    }
}

class Ex3_12 {
    int x = 10;
    int y = 8;

    public void method() {
        System.out.printf("%d를 %d로 나누면, %n",x,y);
        System.out.printf("몫은 %d이고, 나머지는 %d %n",x/y,x%y);
            }
}

class Ex3_13 {
    public  void method() {
        System.out.println(-10%8);
        System.out.println(10%-8);
        System.out.println(-10%-8);
        //그냥 다 무시하고, 왼쪽 피연산자의 부호를 나머지 값에 붙이면 된다.
    }
}
