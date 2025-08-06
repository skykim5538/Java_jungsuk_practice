package ch4;

public class Ex4_31 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            for (int x = 0; x < 10; x++) {
                i += x;
                sum += i;
                System.out.printf("%d , %d%n  ", i, sum);
                if (sum > 100) {
                    break;//sum이 100 초과하면 스탑.
                }
            }//end of while

            if (sum > 100) {
                break;
            }
            System.out.println("i=" + i);
            System.out.println("sum=" + sum);


        }
    }
}


