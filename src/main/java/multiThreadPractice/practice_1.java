package multiThreadPractice;

public class practice_1 {
public static void main(String args[]){
    System.out.println("메인쓰레드 시작");

    // 1. 실행 가능한 작업 객체를 만든다.
    // Runnable은 사용자 정의 '타입'이다.
    // 위 타입을 가지는 참조 변수 counterTask에 new NumberCounter() 라는 객체의 주소를 저장한다.(가리킨다.,참조한다)
    //'실행할 작업'인 NumberCounter 객체를 생성,
    // 이를 '실행 가능한 것 (Runnable)'으로 다룬다.
    Runnable counterTask = new NumberCounter();

    // 2. 새로운 쓰레드에 위의 작업을 할당합니다.
    // 쓰레드에 "카운터"라는 이름을 붙인다.
    Thread counterThread = new Thread(counterTask,"카운터");

    //3. 새로운 쓰래드를 실행시킨다. (start() 호출)
    counterThread.start();

    // 메인 쓰레드는 자기 할 일을 계속한다.
    // 카운터가 5초까지 세는 동안 메인 쓰레드는 이 코드를 바로 실행
    //JVM 메모리 영역에서, 메서드 에리어, 콜스택, 힙 에 들어가는 시점


    //쓰레드를 사용하기 위해서는, run과 start가 반드시 구현되어야 하는 메서드인가?
    System.out.println("[메인 쓰레드] 저는 카운터가 끝나기를 기다리지않고 다른일을 합니다. ");
    System.out.println("메인 쓰레드 종료");



}
}
