package ch4;

import java.util.Scanner;

public class Ex4_5 {
    // 중첩if문 -추가조건을 걸 때 사용. 90점 중 98점은 A+ 아니면 A0.
    public static void main(String args[]) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 점수");
        score = sc.nextInt(); // 입력된 점수(정수)를 받아와서. score에 저장

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        if (score % 10 >= 8) {
            opt = '+';
        } else if (score % 10 < 4) {
            opt = '-';
        }
//        else {
//            opt = '0';
//        } //초기화 기본값을 지정해두면 코드 입력 불필요.
        System.out.printf("당신의 점수 %c%c", grade, opt);
    }

}





//        if (score>=90){
//            grade='A';
//                if(score>=98) {
//                opt = '+';
//                }else if(score<94){
//                grade = '-';
//                }
//        } else if (score>=80){
//            grade = 'B';
//                if(score>=88) {
//                opt = '+';
//                } else if (score<84){
//                grade = '-';
//                }
//        } else {
//            grade = 'C';
//        }
//        System.out.printf("당신의 점수 %c%c", grade,opt);
//    }

