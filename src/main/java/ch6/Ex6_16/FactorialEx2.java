package ch6.Ex6_16;

public class FactorialEx2 {
    static long factorial(int n) {
        if (n <= 0 || n > 20) //0 이하 , 20 초과
            return -1;

        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 21;
        long result = 0;
        for(int i=1; i<= n;i++){
            result = factorial(i);

            if(result == i){
                System.out.printf("유효하지 않은 값입니다. %d%n", n);
            }
            System.out.printf("%2d!=%20d%n",i,result);
        }
    }

}
