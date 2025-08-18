package ch13.Basic.BasicEx13_13;

public class Ex13_13 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx13();
        new Thread(r).start();
        new Thread(r).start();
    }
}
class Account2{
    private int balance =1000;

    public int getBalance(){
        return balance;
    }

    public synchronized void withdraw(int money){
        if(balance>=money){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            balance -=money;
        }
    }
}


class RunnableEx13 implements Runnable{
    Account2 acc =new Account2();

    public void run(){
        while(acc.getBalance()>0){
            int money=(int)(Math.random()*3+1)*100;
            acc.withdraw(money);
            System.out.println("balance:"+acc.getBalance());
        }
    }
}
