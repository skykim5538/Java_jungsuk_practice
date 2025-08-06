package ch4;

import java.util.Scanner;

public class Ex4_4 {
    //if - else id
    public static void main(String args[]) {
        int score = 0; //점수를 저장하기 위한 변수
        char grade = ' '; // 학점을 저장하기 위한 변수
        // 둘 다 공백으로 초기화
        System.out.print("점수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt(); // sc로 입력된 정수를 score에 저장

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.printf("당신의 점수는 %d 이고, 학점은" + grade + "입니다");

    }
}

