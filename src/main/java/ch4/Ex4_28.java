package ch4;

import java.util.Scanner;

public class Ex4_28 {
    public static void main(String args[]){
        int num;
        int sum =0;
        boolean flag =true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get sum: (enter 0 to exit)");


        while(flag){ //flag가 true 이므로, 조건식은 참
            System.out.print(">>");

            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp);

            if( num !=0){
                sum += num; // num이 0이 아니면 계속 더한다.
              } else {
                flag = false;
            }
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
