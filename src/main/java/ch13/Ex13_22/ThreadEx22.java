package ch13.Ex13_22;

public class ThreadEx22 {
    public static void main(String[] args) {

        Runnable r =new  RunnableEx22();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account2{
    private
}