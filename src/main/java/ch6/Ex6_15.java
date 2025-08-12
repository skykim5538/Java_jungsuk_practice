package ch6;

import javax.swing.*;

public class Ex6_15 {
}

class Factorial {
    public static void main(String args[]) {
        int result = factorial(6);
        System.out.println(result);
    }


    static int factorial(int n) {
        int result = 0;

        if (n == 1) {
            result = 1;
            return result;
        } else {
            result = n * factorial(n - 1);
            return result;
        }
    }

}

