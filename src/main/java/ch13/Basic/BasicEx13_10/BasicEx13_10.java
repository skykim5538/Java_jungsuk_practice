package ch13.Basic.BasicEx13_10;


//suspend , resume, stop는 쓰레드의 실행을 제어하는 가장 쉬운 방법이지만,
//교착상태(deadlock)을 일으키기 쉽다. 또한 JavaAPI문서에서도 deprecated 되어있다.
public class BasicEx13_10 {
    public static void main(String[] args) {

        Runnable r = new RunImplEx10();
        Thread th1 = new Thread(r,"*");
        Thread th2 = new Thread(r,"**");
        Thread th3 = new Thread(r,"***");

        th1.start();
        th2.start();
        th3.start();

        try{
            Thread.sleep(2000);
            th1.suspend();  //스레드 th1을 잠시 중단시킨다.
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.suspend();

            th1.resume();   //스레드 th1을 다시 동작하도록 한다.
            Thread.sleep(3000);

            th1.stop();     //스레드 th1을 강제 종료시킨다.
            th2.stop();
            Thread.sleep(2000);
            th3.stop();

        }catch(InterruptedException e){}
    }
}

class RunImplEx10 implements Runnable{
    //Runnable의 인터페이스 구현으로 스레드 구현
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName());
            try{
            Thread.sleep(1000);
            }catch(InterruptedException e){}
    }
}
}
