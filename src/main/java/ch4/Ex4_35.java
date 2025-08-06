package ch4;

import java.util.Scanner;

public class Ex4_35 {
   public static void main(String[] args) {
    int m = 0;
    int n = 0;

    Scanner sc = new Scanner(System.in);


    outer:
    while(true) {
        System.out.println("(1) square");
        System.out.println("(2) square root");
        System.out.println("(3) log");
        System.out.printf("메뉴선택해라 종료는 '0'%n");

        String tmp = sc.nextLine(); //숫자를 문자열로 입력받음
        m=Integer.parseInt(tmp); //문자열을 숫자로 변환

        if(m==0){
            System.out.println("exit program");
            break;
        }else if(!(1<=m && m<=3)){
            System.out.println("unmatched menu");
            continue;
        }

    for(;;){
        System.out.println("계산할 값을 입력하세요(계산 종료 0, 전체종료 99)");
        tmp =sc.nextLine();
        n=Integer.parseInt(tmp);

        if(n==0)
           break;
       if(n==99)
           break outer;
       switch(m){
           case 1:
               System.out.println("result : "+n*n);
               break;
           case 2:
               System.out.println("result : "+Math.sqrt(n));
               break;
           case 3:
               System.out.println("result : "+Math.log(n));
               break;

       }
    }
    }
}

        }
