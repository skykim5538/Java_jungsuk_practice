package ch13.Ex13_1;

// 쓰레드의 구현 방법
//Thread 클래스 상속
//  Runnable 인터페이스 구현
public class TreadEx {
    public static void main(String args[]){

        ThreadEx_1 t1 = new ThreadEx_1();

        Runnable r =  new  ThreadEx_2();
        Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)

        t1.start();
        t2.start();

    }
}

class ThreadEx_1 extends Thread{
    public void run(){  // Thread 클래스의 run() 메서드를 오버라이딩
                            // 오버라이딩 : 상속받은 메서드를 이름만 가져와서 구현해서 사용
        for(int i=0; i<5; i++){
            System.out.println(getName());
        }
    }
}
class ThreadEx_2 extends Thread{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
                //currentThread() 현재실행중인 Tread를 반환한다.
        }
    }
}

