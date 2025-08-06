package ch4;

import java.util.Scanner;

public class Ex4_9_10 {
    public static void main(String[] args) {
        char grade = ' ' ;
        System.out.println("점수 입력하세요 ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int score = Integer.parseInt(str);

//        int score = sc.nextInt();
//
//        switch (score) {
//            case 100: case 99: case 98: case 97:
//                grade = 'A';
//                /// 1점씩 일일이 입력해줘야 함.
//                // 이런 경우 if 문이 더 효율적임
//        }

        switch (score/10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'D';
        }

    }
}
