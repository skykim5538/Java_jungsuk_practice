package ch13.Basic.BasicEx13_9;

import javax.swing.*;


//interrupt() - 한 쓰레드(스택박스)가 sleep(), wait(), join()으로 인해 일시정지(waiting)상태에 있을 때,
//이 쓰레드에 대해 interrupt()를 호출하면,sleep(), wait(), join()에서 Interrupted Exception이 발생하고
//이 쓰레드는 실행대기(runnable) 상태로 바뀐다. = 멈춰있던 쓰레드를 깨우는 것
public class BasicEx13_9 {
    public static void main(String args[]){
        ThreadEx9_1 th9_1 = new ThreadEx9_1();
        th9_1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력");
        System.out.println("입력하신 값은 "+input+"입니다");
        th9_1.interrupt();
        System.out.println("isInterrupt()"+th9_1.isInterrupted());
    }
}
class ThreadEx9_1 extends Thread{
    public void run() {
        int i = 10;

        while(i!=0 && !isInterrupted()){
            System.out.println(i--);
            for(long x=0; x<250000000L;x++);
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}
