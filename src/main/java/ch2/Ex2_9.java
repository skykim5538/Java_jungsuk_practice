package ch2;

import java.lang.invoke.StringConcatFactory;

public class Ex2_9 {
    public static void main(String[] args) {
        //printf의 출력
        String url = "www.skykim.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d= 1.23456;

        System.out.printf("f1=%f , %e, %g\n",f1,f1,f1);
        System.out.printf("f1=%f , %e, %g%n",f1,f1,f1);
        System.out.printf("f2=%f , %e, %g%n",f2,f2,f2);
        System.out.printf("f3=%f , %e, %g%n",f3,f3,f3);
        System.out.printf("d=%f%n",d);
        System.out.printf("d=%14.10f%n",d);
        System.out.printf("[12349835421]%n");
        System.out.printf("1. [%s]%n",url);
        System.out.printf("2. [%5s]%n",url);
        System.out.printf("3. [%30s]%n",url);
        System.out.printf("4. [%-5s]%n",url);
        System.out.printf("5. [%-10s]%n",url);

        System.out.printf("[%.8s]%n",url);
    }
}
