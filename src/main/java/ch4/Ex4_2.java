package ch4;

import java.util.Scanner;

public class Ex4_2 {
    //if문 스캐너
    public static void main(String args[]) {
        int input;
        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
                    //문자열을 받아오는 매서드
        input = Integer.parseInt(tmp);

        if (input == 0){
            System.out.println("입력된 숫자는 0입니다.");
        }
        if (input != 0){
            System.out.println("입력된 숫자는 0이 아닙니다");
            System.out.printf("입력된 숫자는 %d입니다",input);
        }
    }
}
