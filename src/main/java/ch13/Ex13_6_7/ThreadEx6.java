package ch13.Ex13_6_7;

import javax.swing.*;

public class ThreadEx6 {
    public static void main(String args[]) throws Exception {
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
            //다이얼로그 입력창
        System.out.println("입력하신 값은"+input +"입니다");

        for(int i=3;i>0;i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
