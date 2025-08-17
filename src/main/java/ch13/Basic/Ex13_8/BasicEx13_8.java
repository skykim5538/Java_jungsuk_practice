package ch13.Basic.Ex13_8;

//sleep()예제
public class BasicEx13_8 {
    public static void main(String args[]){
        ThreadEx8_1 th8_1 = new ThreadEx8_1();
        ThreadEx8_2 th8_2 = new ThreadEx8_2();
        th8_1.start();
        th8_2.start();

        try{
            th8_1.sleep(2000);
        }catch(InterruptedException e) {}
        System.out.print("<<<< main 종료 >>>>>>");
    }
}

class ThreadEx8_1 extends Thread{
    public void run(){
        for(int i=0; i<300;i++) {
            System.out.print("-");
        }
        System.out.print("<<<< th8_1 종료 >>>>>>");
    }
}

class ThreadEx8_2 extends Thread{
    public void run(){
        for(int i=0;i<300; i++) {
            System.out.print("|");
        }
        System.out.print("<<<< th8_2 종료 >>>>>>");
        }
    }
