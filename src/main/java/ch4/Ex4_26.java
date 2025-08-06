package ch4;

import java.util.Scanner;

public class Ex4_26 {
    public static void main(String[] args) {
        int num =0, sum=0;
        System.out.println("숫자를 입력하세요");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        num = Integer.parseInt(str);

        while(num !=0){
            sum += num%10; // num/10의 나머지를 sum에 순차적으로 저장
            System.out.printf("sum=%3d, num=%d%n",sum,num);
            num /= 10;  // num = num/10;
        }
        System.out.printf("각 자리수 합은 %d",sum);

    }
}
