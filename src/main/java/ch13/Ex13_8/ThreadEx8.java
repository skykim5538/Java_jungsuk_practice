package ch13.Ex13_8;



public class ThreadEx8 {
    public static void main(String[] args) {
        ThreadEx8_1 th8 = new ThreadEx8_1();
            //th8 이라는 쓰레드 객체 생성 = 네모 스택 박스 생성
        ThreadEx8_2 th8_2 = new ThreadEx8_2();
            // th8_2라는 쓰레드 객체 생성 = 네모 스택 박스 생성

        th8_2.setPriority(7);

        System.out.println("Priority of th8(-) =" +th8.getPriority());
        System.out.println("Priority of th8_2(|) =" +th8_2.getPriority());
        th8.start();
        th8_2.start();

    }
}
class ThreadEx8_1 extends Thread{
    public void run(){
            //th8.start(); 선언으로, run()메서드가 가장 먼저 실행된다.
        for(int i=0;i<300;i++){
            System.out.print("-");
            for(int x=0;x<10_000_000;x++);
        }

    }
}
class ThreadEx8_2 extends Thread{
    public void run(){
        for(int i=0;i<300; i++){
            System.out.print("|");
            for (int x=0;x<10_000_000;x++);
        }
    }
}