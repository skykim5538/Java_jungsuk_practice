package multiThreadPractice;

class NumberCounter implements Runnable {

@Override
        // Runnable인터페이스를 사용하면 run() 반드시 구현해야함
    public void run() {
    try{
        for(int i=1;i<=5;i++) {
            // 현재 실행중인 쓰레드의 이름을 가져온다.
            String threadName = Thread.currentThread().getName();
            //Thread클래스의 currentThread()메서
            System.out.println("["+threadName+"] "+i+"초");
            //
            Thread.sleep(1000);
        }
        } catch (InterruptedException e) {
        System.out.println("카운터 쓰레드가 방해를 받았습니다.");
    }
    System.out.println("카운터 쓰레드 작업 완료");
}
}
