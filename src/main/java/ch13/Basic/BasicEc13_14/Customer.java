package ch13.Basic.BasicEc13_14;

//synchronized로 동기화해ㅔ서 공유 데이터를 보호하는 것은 좋은데,
//특정스레드가 객체의 락을 가진 상태로 오랜 시간을 보내지 않도록 하는 것도 중요
//이를 개선하기 위해 고안 된 것 - wait() & notify()

import java.util.ArrayList;

//
public class Customer implements Runnable {
    private Table table;
    private String food;

    Customer(Table table, String food) { //원하는 음식을 지정하는 생성자
        this.table = table;
        this.food = food;
    }

    public void run() {
        while (true) {   //while(true) => 무한루프
                        //무한루프가 있는 이유? 서버의 요청 대기, 실기간 데이터 감시 등
                        //프로그램이 종료되지 않고 계속 특정 작업을 수행해야할 때 사용
                        //이 위에서 쓰레드들이 반복해서 돌아감
            try {
                Thread.sleep(10); //*sleep은 interrupt에 의해 중단될 수 있음
                                        // 만일 중단될 경우,InterruptedException이라는 예외가 발생함
                                        //InterruptedException는 자고 있거나, 쉬고 있는 상태의 스레드를
                                            //다른 스레드가 방해하며 깨울 때 발생하는 예외
                                        //그래서 try-catch문이 필요
                                        // n 초 넣은 이유?
                                        // CPU 자원 낭비 방지 및 다른 스레드에게 기회 제공(점유율 배분)
            } catch (InterruptedException e) { } //try문 안에 InterruptedException이라는 예외 발생 시,
                                                // catch문 안의 식을 실행 해라.는 의미-> 빈칸이므로 이 예외는 무시한다는 의미
                                                // 만일에 대비해서 일단 생성되는 "자바의 규칙"
            String name = Thread.currentThread().getName();

            if (eatFood())
                System.out.println(name + "ate a " + food);
            else
                System.out.println(name + "failed to eat.:(");
        }
    }

    boolean eatFood() {
        return table.remove(food);
    }
}

/// /////////////////
class Cook implements Runnable {
    private Table table;

    Cook(Table table) {
        this.table = table;
    }

    public void run() {
        while (true) {
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        if (dishes.size() >= MAX_FOOD)
            return;
        dishes.add(dish);
        System.out.println("dish:" + dishes.toString());
    }

    public boolean remove(String dishName) {
        synchronized (this) {
            while (dishes.size() == 0) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
            for (int i = 0; i < dishes.size(); i++)
                if (dishName.equals(dishes.get(i))) {
                    dishes.remove(i);
                    return true;
                }
        }
        return false;
    }

    public int dishNum() {
        return dishNames.length;
    }

    class Ex13_14 {
        public static void main(String[] args) {
            Table table = new Table();

            new Thread(new Cook(table), "COOK").start();
            new Thread(new Customer(table, "donut"), "cust1").start();
            new Thread(new Customer(table, "burger"), "cust2").start();

//            Thread.sleep(5000);
            System.exit(0);


        }
    }
}