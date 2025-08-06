package ch4;

import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {
        int num;
        System.out.println("*을 출력할 라인 수를 입력하세요");
        Scanner sc = new Scanner(System.in);
//        String tmp =sc.nextLine();
//        int num2 = Integer.parseInt(tmp);
        num = sc.nextInt(); //문자열  변환 과정을 메서드로 대체


//        for (int i=0; i<num; i++) {
//            for (int j=3; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

        for (int i=0; i<num; i++) {
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
