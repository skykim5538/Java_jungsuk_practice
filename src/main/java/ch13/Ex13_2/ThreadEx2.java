package ch13.Ex13_2;

//start와 run

import static java.lang.invoke.MethodHandles.throwException;

public class ThreadEx2 {
    public static void main(String args[]){
        // main 메소드 호출
        ThreadEx2_1 t1 = new ThreadEx2_1();
            //ThreadEx2_1 스레드 객체 생성 but, 실행중인 것은 아님
        t1.start();
            // start()로 비로소 동작 시작
            // 이때 start()는 run() 메소드를 가장 호출하게 함.
            //main쓰레드와 t1의 쓰레드(일꾼이)가 비동기로 독립적으로 실행
    }
}

class ThreadEx2_1 extends Thread{
    public void run(){
        throwException(); // run() 메서드를 순차적으로 실행시키는 메서드
    }                     // t1.start()에 의해 실행됨.

    public void throwException(){
        try {
            throw new Exception(); // 고의로 예외를 발생시키는 코드
                                    //new Exception()로 예외(참조변수)를 만들었고
                                    // 만든 변수를 thorw함 -> 에러 발생기

        } catch(Exception e){       // 위에서 던져진 (thorw) 예외를 catch 블록이 잡음.
                                    //프로그램이 에러로 멈추는 것을 막고, 예외를 처리할 기회를 줌
                                    // 잡힌 예외는 e 변수에 담김

            e.printStackTrace();    // e에 담긴 예외 정보를 콘솔에 출력하는 메서드

        }
    }
}
