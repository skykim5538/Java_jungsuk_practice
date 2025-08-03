package ch2;

import java.util.Scanner;

public class Ex2_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("두자리 정수를 입력하시오 >");
        String input = sc.nextLine(); //->nextLine(); 한줄 띄우기
        int num = Integer.parseInt(input);
        //input에 들어어온 문자열 값을 정수로 변환하는 메서드 호출
        System.out.println("입력내용: "+input);
        System.out.printf("num : "+num);
    }
}
