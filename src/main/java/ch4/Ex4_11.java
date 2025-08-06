package ch4;

import java.util.Scanner;

public class Ex4_11 {
    //중첩 switch
    public static void main(String[] args) {
        System.out.println("주민번호 입력하세요 111111-1111111");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char gender = sc.next().charAt(7);

        switch (gender) {
            case '1':
            case '3':
                switch (gender) {
                    case '1':
                        System.out.println("2000년도 이전 출생");
                        break;
                    case '3':
                        System.out.println("2000년도 이후 출생");

                }
                break;
            case '2':
            case '4':
                switch (gender) {
                    case '2':
                        System.out.println("2000년도 이전 출생");
                        break;
                    case '4':
                        System.out.println("2000년도 이후 출생");
                        break;
                }
                break;
        }
    }
}
