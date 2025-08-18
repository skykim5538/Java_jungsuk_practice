package ch13.Basic.BasicEx13_12;

public class Ex13_12 {
    public static void main(String args[]) {
        Runnable r = new RunnableEx12();

        new Thread(r).start();
        new Thread(r).start();
    }
}
