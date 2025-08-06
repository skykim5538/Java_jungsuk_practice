package ch4;

import java.util.Scanner;

public class Ex4_33 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.printf("메뉴선택해라 종료는 '0'%n");

        String input = sc.nextLine(); //숫자를 문자열로 입력받음
        m=Integer.parseInt(input); //문자열을 숫자로 변환

            if(m==0){
                System.out.println("exit program");
                break;
            }else if(!(1<=m && m<=3)){
                System.out.println("unmatched menu");
                continue;
            }
            System.out.printf("선택한 메뉴 %d",m);
        }

    }
}
