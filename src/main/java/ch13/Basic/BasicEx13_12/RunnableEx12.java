package ch13.Basic.BasicEx13_12;

public class RunnableEx12 implements Runnable {
    Account acc = new Account();

    public void run(){
        while(acc.getBalance()>0){
            int money =(int)(Math.random()*3+1)*100;
            acc.withdraw(money);
            System.out.println("balance = "+acc.getBalance());
        }
    }

}
