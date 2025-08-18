package ch13.Ex13_20;


//가비지 컬렉터를 흉내내어 간단히 구현해보자
public class ThreadEx20 {
    public static void main(String args[]) {
        ThreadEx20_1 gc = new ThreadEx20_1();
        gc.setDaemon(true);
        gc.start();

        for (int i = 0; i < 20; i++) {
            int requiredMemory = (int) (Math.random() * 10) * 20;
            // 정수형으로 20의 배수 (1,2,3...에 20을 각각 곱함)
            // Q1. 이 코드가 의미하는 바? 번호 무작위 생성기


            if (gc.freeMemory() < requiredMemory
                    || gc.freeMemory() < gc.totalMemory() * 0.4) {
                gc.interrupt();

                //필요한 메모리가 사용할 수 있는 양보다 크거나 전체 메모리의 60%이상을
                // 사용했을 경우 gc를 깨우겠다. >> gc.interrupt();는 잠자는 중
                //Q 2. 왜 잠자고 있다고 하지? 어디서 이미 호출한 번 사용한건가?
                // 잠잔다는 표현이 뭐지?
            }
            gc.usedMemory += requiredMemory;
            System.out.println("usedMamory :" + gc.usedMemory);
        }
    }
}

class ThreadEx20_1 extends Thread { //Q3. 상속한 이유?
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;


    public void run() {
        while (true) { //run을 실행할 반복문 사용
            try {
                Thread.sleep(10 * 1000);  //10초를 기다림
            } catch(InterruptedException e) {
                System.out.println("Awaken by interrupt().");
            }
            gc();// garbage collection 역할을 수행
            System.out.println("Garbage collected.Free Memory : " + freeMemory());
        }
    }

    public void gc() {
        usedMemory -= 300;
        if (usedMemory < 0)
            usedMemory = 0;
    }

    public int totalMemory() {
        return MAX_MEMORY;
    }

    public int freeMemory() {
        return MAX_MEMORY - usedMemory;
    }
}

