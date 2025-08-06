package ch4;

import java.util.Scanner;

public class Ex4_8 {
    public static void main(String[] args) {
        System.out.println("주민번호를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();
        char gen = regNo.charAt(7);
            //입력받은 8째 문자를 gen에 저장

        switch (gen) {
            case '1': case '3':
                System.out.println("남자");
                break;
            case '2': case '4':
                System.out.println("여자");
                break;
                default: System.out.println("유효하지않은 번호");

        }
    }
}
