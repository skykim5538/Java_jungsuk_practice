package ch4;

import java.util.Scanner;

public class Ex4_12 {
    public static void main(String[] args) {
    int score=0;
        System.out.println("당신의 점수는 ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        score = Integer.parseInt(str);

        char grade = switch(score/10) {
        case 9,10 ->'A';
        default -> 'f';
        };
    }
}
