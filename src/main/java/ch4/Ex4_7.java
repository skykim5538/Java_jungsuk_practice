package ch4;

import java.util.Scanner;

public class Ex4_7 {
    //Math.random

    public static void main(String[] args) {
        System.out.println("가우(1), 바위(2),보(3) 하나를 입력하세요");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int) (Math.random() * 3) + 1;
        //+1은 정수 보정값.
        //Math.random은 범위가 0이상 3미만임.
        System.out.printf("당신의 입력은 %d입니다.", user);
        System.out.printf("com의 입력은 %d입니다.", com);

        switch (user - com) {
            case 2:
            case -1:
                System.out.println("당신의 패배");
                break;
            case -2:
            case 1:
                System.out.println("당신의 승리");
                break;
            case 0:
                System.out.println("무승부");
                break;
        }
    }
}

