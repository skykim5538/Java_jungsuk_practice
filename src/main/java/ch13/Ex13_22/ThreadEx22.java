package ch13.Ex13_22;

public class ThreadEx22 {
    public static void main(String[] args) {

        Runnable r =new  RunnableEx22();

        new Thread(r).start();  //쓰레드 1 생성 및 start
        new Thread(r).start();  //쓰레드 2 생성 및 start
    }
}

class Account2{

    private int balance =1000;

    public int getBalance() {
                 return balance;
                }
    public synchronized void whithdraw(int money){
        if(balance>=money){
            //balance가 money이상일 경우 try문 실   행
            try{
            Thread.sleep(1000); // 1초 동안 waiting 상태 
            }catch(InterruptedException e){}
                    // 1초 동안 아무런 interrupt가 없었으면, catch문은 무시되고 건너 뜀
                    // 1초 동안 interrupt가 발생하면, catch문 블럭 실행 
                    // 그러나 현재 catch문은 빈칸이니까(실행할 코드가 없으니까) 그냥 지나간다.
                                                
            balance -=money;
                // 위 코드 진행 후 반드시 금액 차감됨
        }
    }

}
class RunnableEx22 implements Runnable{

    Account2 acc = new Account2();

    public void run(){
        while(acc.getBalance()>0){
                //Account2의 getBalance의 return 값이 0보다 크면 계속 반복
            int money=(int)(Math.random()*3+1)*100; //0<Math.random()<3  +1
                                                    //(1<Math.random()<4 ) *100
                //money 에 100,200,300까지 임의의 랜덤 값을 저장
            acc.whithdraw(money);
                //withdraw메서드 실행 -> if문 종료 후, balance에서 money값만큼 감소
            System.out.println("balance:"+acc.getBalance());
                //getBalance실행 시 -> 차감된 금액의 balance를 출력

        }
    }
}