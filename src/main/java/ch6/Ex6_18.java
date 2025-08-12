package ch6;

public class Ex6_18 {
    public static void main(String args[]) {
        int x =2;
        int n = 5;
        long result = 0;

        for(int i=1; i<=n; i++) {
            result += power(x,i);
        }
        System.out.println(result);
    }
    static long power(int x, int n) {
        if(n == 1) return x;
        //n=1일때, x를 반환
        return x*power(x, n-1);
        //n=1이 아닐때, 재귀호출
    }
}
