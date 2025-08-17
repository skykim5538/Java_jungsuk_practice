package ch13.Ex13_3;

public class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();  // run()은 그저 메서드를 실행시킬 뿐,
                    //start()처럼 새로운 쓰래드를 생성하지 않음

    }
}

class ThreadEx3_1 extends Thread{
    public void run() {
        throwException();

    }
public void throwException(){
        try{
            throw new Exception();
            } catch(Exception e) {
            e.printStackTrace();
        }
}

}