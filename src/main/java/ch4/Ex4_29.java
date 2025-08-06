package ch4;

import java.util.Scanner;

public class Ex4_29 {
    public static void main (String args[]) {
        int input =0, answer = 0;

        answer= (int)(100*(Math.random()))+1;
        System.out.println(answer);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1-100사이의 정수 입력하세요");;
            input = sc.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수를 입력하시오");
            } else if (input<answer) {
                System.out.println(" 더 작은 수를 입력하시오");
            }
        }while (input != answer);
            //조건식이 TRUE이면 반복
            // FALSE이면 반복 종료
        System.out.println("정답");
    }
    }

