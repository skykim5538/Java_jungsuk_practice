package ch4;

import java.util.Scanner;

import static java.util.Collections.replaceAll;

public class Ex4_6 {
    //switch문
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요");

        Scanner sc = new Scanner(System.in);
        //System.in 사용자 입력 스트림을 받는 객체
        String input= sc.nextLine();
        String digits =input.replaceAll("[^0-9]", "");
        int month = Integer.parseInt(digits);
        // 일단 숫자만 가져올 수 있게만 되었으나. 123 입력과 같은 예외 상황이 발생할 수 도
        //todo 1~12월 입력 외 발생하는 예외 처리 로직 필요(12월 2일 등등)



        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.printf("입력한 %d월은 겨울입니다.", month);
                break;
            case 3:
            case 4:
            case 5:
                System.out.printf("입력한 %d월은 봄입니다.", month);
                break;
            case 6:
            case 7:
            case 8:
                System.out.printf("입력한 %d월은 여름입니다.", month);
                break;
            case 9:
            case 10:
            case 11:
                System.out.printf("입력한 %d월은 가을입니다.", month);
                break;

        }

    }


}
