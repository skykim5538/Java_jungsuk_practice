package ch13.Ex13_4w5;

public class ThreadEx5 {
    static long startTime = 0;
    public static void main(String args[]){
        ThreadEx5_1 th5 = new ThreadEx5_1();
        th5.start();
        startTime=System.currentTimeMillis();
        for(int i =0;i<100_000;i++)
            System.out.printf("%s","=");
        System.out.print("소요시간 1="+(System.currentTimeMillis()-ThreadEx5.startTime));



        System.out.printf("%n%n%n%n");
    }
}


class ThreadEx5_1 extends Thread{
    public void run(){
        for(int i=0;i<100_000;i++)
            System.out.printf("%s","|");
        System.out.print("소요시간 2="+(System.currentTimeMillis()-ThreadEx5.startTime));
    }
}

//소요시간 1 = 675 (싱글코어)
//소요시간 2 = 684 (멀티코어)